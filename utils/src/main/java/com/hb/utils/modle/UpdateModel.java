package com.hb.utils.modle;

import java.io.Serializable;

/**
 * 更新
 */

public class UpdateModel implements Serializable{
	private boolean NewVersion;
	private VersionInfo VersionInfo;
	public boolean isNewVersion() {
		return NewVersion;
	}
	public void setNewVersion(boolean newVersion) {
		NewVersion = newVersion;
	}
	public VersionInfo getVersionInfo() {
		return VersionInfo;
	}
	public void setVersionInfo(VersionInfo versionInfo) {
		VersionInfo = versionInfo;
	}
	@Override
	public String toString() {
		return "UpdateModel [NewVersion=" + NewVersion + ", VersionInfo=" + VersionInfo + "]";
	}

	public static class VersionInfo{
		private String AppName;
		private int Version;
		private String ChannelId;
		private String Descript;
		private String DownloadUri;
		private boolean isUpdate = true;//是否强制升级，默认为true


		public boolean isUpdate() {
			return isUpdate;
		}

		public void setUpdate(boolean update) {
			isUpdate = update;
		}

		public String getAppName() {
			return AppName;
		}
		public void setAppName(String appName) {
			AppName = appName;
		}
		public int getVersion() {
			return Version;
		}
		public void setVersion(int version) {
			Version = version;
		}
		public String getChannelId() {
			return ChannelId;
		}
		public void setChannelId(String channelId) {
			ChannelId = channelId;
		}
		public String getDescript() {
			return Descript;
		}
		public void setDescript(String descript) {
			Descript = descript;
		}
		public String getDownloadUri() {
			return DownloadUri;
		}
		public void setDownloadUri(String downloadUri) {
			DownloadUri = downloadUri;
		}
		@Override
		public String toString() {
			return "VersionInfo [AppName=" + AppName + ", Version=" + Version + ", ChannelId=" + ChannelId + ", Descript=" + Descript + ", DownloadUri=" + DownloadUri + "]";
		}
		
	}
}
