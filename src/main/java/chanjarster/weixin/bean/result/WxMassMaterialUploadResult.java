package chanjarster.weixin.bean.result;

import chanjarster.weixin.util.json.WxGsonBuilder;

/**
 * 上传群发所用的素材的结果
 * @author chanjarster
 *
 */
public class WxMassMaterialUploadResult {

  protected String type;
  protected String media_id;
  protected long created_at;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getMedia_id() {
    return media_id;
  }

  public void setMedia_id(String media_id) {
    this.media_id = media_id;
  }

  public long getCreated_at() {
    return created_at;
  }

  public void setCreated_at(long created_at) {
    this.created_at = created_at;
  }

  public static WxMassMaterialUploadResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxMassMaterialUploadResult.class);
  }

  @Override
  public String toString() {
    return "WxUploadResult [type=" + type + ", media_id=" + media_id + ", created_at=" + created_at + "]";
  }

}