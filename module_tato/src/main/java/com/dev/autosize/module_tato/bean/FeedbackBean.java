package com.dev.autosize.module_tato.bean;

import java.util.List;

/**
 * Created by jemi on 2018/9/18.
 */

public class FeedbackBean {

    private int id;
    private int com_id;
    private int type;
    private String entity_class;
    private int entity_id;
    private int form_tpl_id;
    private Object code;
    private String title;
    private Object validated_rule_class;
    private Object validated_rule_data;
    private Object calc_rule_class;
    private Object calc_rule_data;
    private String value;
    private String bonus_point;
    private String fine_point;
    private int views_count;
    private int created_by;
    private int updated_by;
    private int state;
    private int status;
    private int position;
    private String created_at;
    private String updated_at;
    private String content;
    private String anonymous;
    private OtherEavBean other_eav;
    private FormEavBean form_eav;
    private String creator;
    private String reply_count;
    private String new_comment_time;
    private String name;
    // private List<ImageBean> images;
    private List<EavBean> eav;
    private List<CommentBean> comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEntity_class() {
        return entity_class;
    }

    public void setEntity_class(String entity_class) {
        this.entity_class = entity_class;
    }

    public int getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(int entity_id) {
        this.entity_id = entity_id;
    }

    public int getForm_tpl_id() {
        return form_tpl_id;
    }

    public void setForm_tpl_id(int form_tpl_id) {
        this.form_tpl_id = form_tpl_id;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getValidated_rule_class() {
        return validated_rule_class;
    }

    public void setValidated_rule_class(Object validated_rule_class) {
        this.validated_rule_class = validated_rule_class;
    }

    public Object getValidated_rule_data() {
        return validated_rule_data;
    }

    public void setValidated_rule_data(Object validated_rule_data) {
        this.validated_rule_data = validated_rule_data;
    }

    public Object getCalc_rule_class() {
        return calc_rule_class;
    }

    public void setCalc_rule_class(Object calc_rule_class) {
        this.calc_rule_class = calc_rule_class;
    }

    public Object getCalc_rule_data() {
        return calc_rule_data;
    }

    public void setCalc_rule_data(Object calc_rule_data) {
        this.calc_rule_data = calc_rule_data;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBonus_point() {
        return bonus_point;
    }

    public void setBonus_point(String bonus_point) {
        this.bonus_point = bonus_point;
    }

    public String getFine_point() {
        return fine_point;
    }

    public void setFine_point(String fine_point) {
        this.fine_point = fine_point;
    }

    public int getViews_count() {
        return views_count;
    }

    public void setViews_count(int views_count) {
        this.views_count = views_count;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(String anonymous) {
        this.anonymous = anonymous;
    }

    public OtherEavBean getOther_eav() {
        return other_eav;
    }

    public void setOther_eav(OtherEavBean other_eav) {
        this.other_eav = other_eav;
    }

    public FormEavBean getForm_eav() {
        return form_eav;
    }

    public void setForm_eav(FormEavBean form_eav) {
        this.form_eav = form_eav;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getReply_count() {
        return reply_count;
    }

    public void setReply_count(String reply_count) {
        this.reply_count = reply_count;
    }

    public String getNew_comment_time() {
        return new_comment_time;
    }

    public void setNew_comment_time(String new_comment_time) {
        this.new_comment_time = new_comment_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public List<ImageBean> getImages() {
    //     return images;
    // }
    //
    // public void setImages(List<ImageBean> images) {
    //     this.images = images;
    // }

    public List<EavBean> getEav() {
        return eav;
    }

    public void setEav(List<EavBean> eav) {
        this.eav = eav;
    }

    public List<CommentBean> getComment() {
        return comment;
    }

    public void setComment(List<CommentBean> comment) {
        this.comment = comment;
    }

    public static class OtherEavBean {
        /**
         * anonymous : 1
         * form_tpl_id : 3
         */

        private String anonymous;
        private String form_tpl_id;

        public String getAnonymous() {
            return anonymous;
        }

        public void setAnonymous(String anonymous) {
            this.anonymous = anonymous;
        }

        public String getForm_tpl_id() {
            return form_tpl_id;
        }

        public void setForm_tpl_id(String form_tpl_id) {
            this.form_tpl_id = form_tpl_id;
        }
    }

    public static class FormEavBean {
        /**
         * title :
         * anonymous : 1
         * content : 一个脑洞
         * images :
         * form_tpl_id : 3
         */

        private String title;
        private String anonymous;
        private String content;
        private String images;
        private String form_tpl_id;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAnonymous() {
            return anonymous;
        }

        public void setAnonymous(String anonymous) {
            this.anonymous = anonymous;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getForm_tpl_id() {
            return form_tpl_id;
        }

        public void setForm_tpl_id(String form_tpl_id) {
            this.form_tpl_id = form_tpl_id;
        }
    }

    public static class EavBean {
        /**
         * id : 48
         * com_id : 0
         * entity_id : 12
         * attribute_id : 0
         * attribute_code : title
         * value :
         * status : 1
         * position : 0
         * created_at : 2018-11-27 09:20:26
         * updated_at : 2018-11-27 09:20:26
         */

        private int id;
        private int com_id;
        private int entity_id;
        private int attribute_id;
        private String attribute_code;
        private String value;
        private int status;
        private int position;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCom_id() {
            return com_id;
        }

        public void setCom_id(int com_id) {
            this.com_id = com_id;
        }

        public int getEntity_id() {
            return entity_id;
        }

        public void setEntity_id(int entity_id) {
            this.entity_id = entity_id;
        }

        public int getAttribute_id() {
            return attribute_id;
        }

        public void setAttribute_id(int attribute_id) {
            this.attribute_id = attribute_id;
        }

        public String getAttribute_code() {
            return attribute_code;
        }

        public void setAttribute_code(String attribute_code) {
            this.attribute_code = attribute_code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }

    public static class CommentBean {
        /**
         * id : 3
         * form_id : 12
         * title : 脑洞大开
         * content : 脑洞大开
         * created_by : 138
         * updated_by : 138
         * status : 1
         * position : 0
         * created_at : 2018-11-27 09:20:55
         * updated_at : 2018-11-27 09:20:55
         * userinfo : {"username":"孙悟空","image":null}
         * images : []
         * history_comment : 脑洞大开
         */

        private int id;
        private int form_id;
        private String title;
        private String content;
        private int created_by;
        private int updated_by;
        private int status;
        private int position;
        private String created_at;
        private String updated_at;
        private UserinfoBean userinfo;
        private String history_comment;
        private List<?> images;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getForm_id() {
            return form_id;
        }

        public void setForm_id(int form_id) {
            this.form_id = form_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getCreated_by() {
            return created_by;
        }

        public void setCreated_by(int created_by) {
            this.created_by = created_by;
        }

        public int getUpdated_by() {
            return updated_by;
        }

        public void setUpdated_by(int updated_by) {
            this.updated_by = updated_by;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public UserinfoBean getUserinfo() {
            return userinfo;
        }

        public void setUserinfo(UserinfoBean userinfo) {
            this.userinfo = userinfo;
        }

        public String getHistory_comment() {
            return history_comment;
        }

        public void setHistory_comment(String history_comment) {
            this.history_comment = history_comment;
        }

        public List<?> getImages() {
            return images;
        }

        public void setImages(List<?> images) {
            this.images = images;
        }

        public static class UserinfoBean {
            /**
             * username : 孙悟空
             * image : null
             */

            private String username;
            private Object image;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public Object getImage() {
                return image;
            }

            public void setImage(Object image) {
                this.image = image;
            }
        }
    }
}
