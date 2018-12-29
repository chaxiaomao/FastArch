package com.dev.autosize.module_tato.bean;

/**
 * Created by Administrator on 2018-12-29.
 */

public class BaseResponse<T> {

    public T data;
    // public MetaBean meta;

    public static class MetaBean {
        /**
         * code : 000
         * msg : Operation completed successfully!
         * time : 2018-08-28 09:57:48
         * extraData : null
         */

        private String code;
        private String msg;
        private String time;
        private ExtraDataBean extraData;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public ExtraDataBean getExtraData() {
            return extraData;
        }

        public void setExtraData(ExtraDataBean extraData) {
            this.extraData = extraData;
        }

        public static class ExtraDataBean {
            /**
             * totalCount : 2
             * pageCount : 1
             * currentPage : 1
             * perPage : 20
             */

            private int totalCount;
            private int pageCount;
            private int currentPage;
            private int perPage;

            public int getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(int totalCount) {
                this.totalCount = totalCount;
            }

            public int getPageCount() {
                return pageCount;
            }

            public void setPageCount(int pageCount) {
                this.pageCount = pageCount;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getPerPage() {
                return perPage;
            }

            public void setPerPage(int perPage) {
                this.perPage = perPage;
            }
        }
    }

}
