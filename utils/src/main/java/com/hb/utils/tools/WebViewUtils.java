package com.hb.utils.tools;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * WebViewUtils 工具类
 * 
 * @author txl
 * 
 */
public class WebViewUtils {



	private static Spanned switchInfoByCode(WebView webView, int errorCode) {
		String message = "";
		switch (errorCode) {
		case WebViewClient.ERROR_AUTHENTICATION:
			message = "用户身份验证失败";
			break;
		case WebViewClient.ERROR_BAD_URL:
			message = "不正确的网址";
			break;
		case WebViewClient.ERROR_FAILED_SSL_HANDSHAKE:
			message = "无法执行SSL握手";
			break;
		case WebViewClient.ERROR_FILE:
			message = "通用文件错误";
			break;
		case WebViewClient.ERROR_FILE_NOT_FOUND:
			message = "资源未找到";
			break;
		case WebViewClient.ERROR_HOST_LOOKUP:
			message = "服务器或代理主机名查找失败";
			break;
		case WebViewClient.ERROR_IO:
			message = "无法读取或写入到该服务器";
			break;
		case WebViewClient.ERROR_PROXY_AUTHENTICATION:
			message = "用户身份验证失败的代理";
			break;
		case WebViewClient.ERROR_REDIRECT_LOOP:
			message = "重定向过多，请刷新重试";
			break;
		case WebViewClient.ERROR_TIMEOUT:
			message = "连接超时，请检查网络后刷新重试";
			break;
		case WebViewClient.ERROR_TOO_MANY_REQUESTS:
			message = "请求太频繁，服务器拒绝";
			break;
		case WebViewClient.ERROR_UNKNOWN:
			message = "未知错误，请刷新重试";
			break;
		case WebViewClient.ERROR_UNSUPPORTED_SCHEME:
			message = "不支持的认证方案";
			break;
		case WebViewClient.ERROR_CONNECT:
			message = "连接失败，网络不畅或服务器维护";
			break;
		case 404:
			message = "页面丢失啦，刷新再试试吧";
			break;
		case 500:
			message = "服务器错误，请稍后再试";
			break;
		default:
			message = "连接失败，请稍后再试";
		}
		return Html.fromHtml("<h1>errorCode " + errorCode + "</h1>" + "\n" + message);
	}

	/**
	 * 用网页标题来判断网页是否含有404 500 等错误
	 * 
	 * @param title
	 * @return 0 为 无错 ；非0为有错，值为错误码
	 */
	public static int testErrorByWebTitle(String title) {
		System.out.println("title=" + title);

		if ((title.contains("Runtime") || title.contains("Error")) || (title.contains("runtime") || title.contains("error"))) {
			return 500;
		}

		int errorCode = 0;

		if (TextUtils.isEmpty(title)) {
			return errorCode;
		}

		// 如果标题都不是以 4、5、6开头的就说明没有http错误
		if (title.contains("400")) {
			return 400;
		}

		if (title.contains("500")) {
			return 500;
		}

		if (!title.contains(" - ")) {
			return errorCode;
		}

		try {
			errorCode = Integer.parseInt(title.split(" - ")[0]);
		} catch (Exception e) {
			e.printStackTrace();
			errorCode = 0;
		}
		return errorCode;
	}
}
