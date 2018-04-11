package com.hb.utils.tools;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * xml工具类
 *
 * @author sleep
 * @date 2016-09-13
 */
public class XmlTool {

    /**
     * String 转 org.dom4j.Document
     *
     * @param xml
     * @return
     * @throws DocumentException
     */
    public static Document strToDocument(String xml) throws DocumentException {
        return DocumentHelper.parseText(xml);
    }

    /**
     * org.dom4j.Document 转  com.alibaba.fastjson.JSONObject
     *
     * @param xml
     * @return
     * @throws DocumentException
     */
    public static JSONObject documentToJSONObject(String xml) {
        JSONObject jsonObject = null;
        try {
            jsonObject = elementToJSONObject(strToDocument(xml).getRootElement());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * org.dom4j.Element 转  com.alibaba.fastjson.JSONObject
     *
     * @param node
     * @return
     */
    public static JSONObject elementToJSONObject(Element node) {
        JSONObject result = new JSONObject();
        try {
            // 当前节点的名称、文本内容和属性
            List<Attribute> listAttr = node.attributes();// 当前节点的所有属性的list
            for (Attribute attr : listAttr) {// 遍历当前节点的所有属性
                result.put(attr.getName(), attr.getValue());
            }
            // 递归遍历当前节点所有的子节点
            List<Element> listElement = node.elements();// 所有一级子节点的list
            if (!listElement.isEmpty()) {
                JSONArray jsonArray = new JSONArray();
                result.put("item", jsonArray);// 没有则创建
                for (Element e : listElement) {// 遍历所有一级子节点
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("title", e.attributeValue("title"));
                    jsonObject.put("value", e.getText());
                    jsonArray.put(jsonObject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;
    }

}