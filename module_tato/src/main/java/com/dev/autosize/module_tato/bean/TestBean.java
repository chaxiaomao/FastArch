package com.dev.autosize.module_tato.bean;

import java.util.List;

/**
 * Created by Administrator on 2018-12-29.
 */

public class TestBean {

    private List<KbsCatalogBean> data;

    public List<KbsCatalogBean> getData() {
        return data;
    }

    public void setData(List<KbsCatalogBean> data) {
        this.data = data;
    }

    public static class KbsCatalogBean {
        private int com_kbs_catalog;
        private String catalog_name;
        private List<KbsCatalogDetailBean.DataBean> catalog_article;
        private List<KbsCatalogBean> children_catalogs;

        public int getCom_kbs_catalog() {
            return com_kbs_catalog;
        }

        public void setCom_kbs_catalog(int com_kbs_catalog) {
            this.com_kbs_catalog = com_kbs_catalog;
        }

        public String getCatalog_name() {
            return catalog_name;
        }

        public void setCatalog_name(String catalog_name) {
            this.catalog_name = catalog_name;
        }

        public List<KbsCatalogDetailBean.DataBean> getCatalog_article() {
            return catalog_article;
        }

        public void setCatalog_article(List<KbsCatalogDetailBean.DataBean> catalog_article) {
            this.catalog_article = catalog_article;
        }

        public List<KbsCatalogBean> getChildren_catalogs() {
            return children_catalogs;
        }

        public void setChildren_catalogs(List<KbsCatalogBean> children_catalogs) {
            this.children_catalogs = children_catalogs;
        }

        public static class KbsCatalogDetailBean {
            private List<DataBean> data;

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean {

                private int id;
                private int com_id;
                private int kbs_page_id;
                private int type;
                private String code;
                private String seo_code;
                private String title;
                private String breadcrumb;
                private Object meta_title;
                private Object meta_keywords;
                private String meta_description;
                private Object content_heading;
                private String content;
                private String layout;
                private Object custom_theme;
                private Object access_rule;
                private int view_count;
                private int comment_count;
                private int quoted_times;
                private int is_filed;
                private int is_share;
                private int is_released;
                private String revision;
                private String released_at;
                private int created_by;
                private int updated_by;
                private int state;
                private int status;
                private int position;
                private String created_at;
                private String updated_at;
                private LinksBeanX _links;

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

                public int getKbs_page_id() {
                    return kbs_page_id;
                }

                public void setKbs_page_id(int kbs_page_id) {
                    this.kbs_page_id = kbs_page_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getSeo_code() {
                    return seo_code;
                }

                public void setSeo_code(String seo_code) {
                    this.seo_code = seo_code;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getBreadcrumb() {
                    return breadcrumb;
                }

                public void setBreadcrumb(String breadcrumb) {
                    this.breadcrumb = breadcrumb;
                }

                public Object getMeta_title() {
                    return meta_title;
                }

                public void setMeta_title(Object meta_title) {
                    this.meta_title = meta_title;
                }

                public Object getMeta_keywords() {
                    return meta_keywords;
                }

                public void setMeta_keywords(Object meta_keywords) {
                    this.meta_keywords = meta_keywords;
                }

                public String getMeta_description() {
                    return meta_description;
                }

                public void setMeta_description(String meta_description) {
                    this.meta_description = meta_description;
                }

                public Object getContent_heading() {
                    return content_heading;
                }

                public void setContent_heading(Object content_heading) {
                    this.content_heading = content_heading;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getLayout() {
                    return layout;
                }

                public void setLayout(String layout) {
                    this.layout = layout;
                }

                public Object getCustom_theme() {
                    return custom_theme;
                }

                public void setCustom_theme(Object custom_theme) {
                    this.custom_theme = custom_theme;
                }

                public Object getAccess_rule() {
                    return access_rule;
                }

                public void setAccess_rule(Object access_rule) {
                    this.access_rule = access_rule;
                }

                public int getView_count() {
                    return view_count;
                }

                public void setView_count(int view_count) {
                    this.view_count = view_count;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getQuoted_times() {
                    return quoted_times;
                }

                public void setQuoted_times(int quoted_times) {
                    this.quoted_times = quoted_times;
                }

                public int getIs_filed() {
                    return is_filed;
                }

                public void setIs_filed(int is_filed) {
                    this.is_filed = is_filed;
                }

                public int getIs_share() {
                    return is_share;
                }

                public void setIs_share(int is_share) {
                    this.is_share = is_share;
                }

                public int getIs_released() {
                    return is_released;
                }

                public void setIs_released(int is_released) {
                    this.is_released = is_released;
                }

                public String getRevision() {
                    return revision;
                }

                public void setRevision(String revision) {
                    this.revision = revision;
                }

                public String getReleased_at() {
                    return released_at;
                }

                public void setReleased_at(String released_at) {
                    this.released_at = released_at;
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

                public LinksBeanX get_links() {
                    return _links;
                }

                public void set_links(LinksBeanX _links) {
                    this._links = _links;
                }

                public static class LinksBeanX {

                    private SelfBeanX self;
                    private IndexBean index;

                    public SelfBeanX getSelf() {
                        return self;
                    }

                    public void setSelf(SelfBeanX self) {
                        this.self = self;
                    }

                    public IndexBean getIndex() {
                        return index;
                    }

                    public void setIndex(IndexBean index) {
                        this.index = index;
                    }

                    public static class SelfBeanX {
                        /**
                         * href : {"href":"http://fe-api-zdt011.local.com/v1/plugins/com/com-kbs/default/view?id=1"}
                         */

                        private HrefBean href;

                        public HrefBean getHref() {
                            return href;
                        }

                        public void setHref(HrefBean href) {
                            this.href = href;
                        }

                        public static class HrefBean {
                            /**
                             * href : http://fe-api-zdt011.local.com/v1/plugins/com/com-kbs/default/view?id=1
                             */

                            private String href;

                            public String getHref() {
                                return href;
                            }

                            public void setHref(String href) {
                                this.href = href;
                            }
                        }
                    }

                    public static class IndexBean {

                        private HrefBeanX href;

                        public HrefBeanX getHref() {
                            return href;
                        }

                        public void setHref(HrefBeanX href) {
                            this.href = href;
                        }

                        public static class HrefBeanX {

                            private String href;

                            public String getHref() {
                                return href;
                            }

                            public void setHref(String href) {
                                this.href = href;
                            }
                        }
                    }
                }
            }
        }
    }
}
