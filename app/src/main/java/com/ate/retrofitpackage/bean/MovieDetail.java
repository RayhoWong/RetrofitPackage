package com.ate.retrofitpackage.bean;

import java.util.List;

/**
 * 电影的详细信息
 */
public class MovieDetail {

    /**
     * rating : {"max":10,"average":8.4,"stars":"45","min":0}
     * reviews_count : 2658
     * wish_count : 65378
     * douban_site :
     * year : 2018
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg"}
     * alt : https://movie.douban.com/subject/24773958/
     * id : 24773958
     * mobile_url : https://movie.douban.com/subject/24773958/mobile
     * title : 复仇者联盟3：无限战争
     * do_count : null
     * share_url : https://m.douban.com/movie/subject/24773958
     * seasons_count : null
     * schedule_url : https://movie.douban.com/subject/24773958/cinema/
     * episodes_count : null
     * countries : ["美国"]
     * genres : ["动作","科幻","奇幻"]
     * collect_count : 235194
     * casts : [{"alt":"https://movie.douban.com/celebrity/1016681/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg"},"name":"小罗伯特·唐尼","id":"1016681"},{"alt":"https://movie.douban.com/celebrity/1021959/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.jpg"},"name":"克里斯·海姆斯沃斯","id":"1021959"},{"alt":"https://movie.douban.com/celebrity/1017885/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.jpg"},"name":"克里斯·埃文斯","id":"1017885"},{"alt":"https://movie.douban.com/celebrity/1040505/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p15885.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p15885.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p15885.jpg"},"name":"马克·鲁弗洛","id":"1040505"}]
     * current_season : null
     * original_title : Avengers: Infinity War
     * summary : 《复仇者联盟3：无限战争》是漫威电影宇宙10周年的历史性集结，将为影迷们带来史诗版的终极对决。面对灭霸突然发起的闪电袭击，复仇者联盟及其所有超级英雄盟友必须全力以赴，才能阻止他对全宇宙造成毁灭性的打击。
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1321812/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg"},"name":"安东尼·罗素","id":"1321812"},{"alt":"https://movie.douban.com/celebrity/1320870/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.jpg"},"name":"乔·罗素","id":"1320870"}]
     * comments_count : 88463
     * ratings_count : 223846
     * aka : ["复联3","复仇者联盟：无限之战(台)","复仇者联盟3：无尽之战","Avengers: Infinity War - Part I","The Avengers 3: Part 1"]
     */

    public int code;
    public String msg;

    public RatingBean rating;
    public int reviews_count;
    public int wish_count;
    public String douban_site;
    public String year;
    public ImagesBean images;
    public String alt;
    public String id;
    public String mobile_url;
    public String title;
    public Object do_count;
    public String share_url;
    public Object seasons_count;
    public String schedule_url;
    public Object episodes_count;
    public int collect_count;
    public Object current_season;
    public String original_title;
    public String summary;
    public String subtype;
    public int comments_count;
    public int ratings_count;
    public List<String> countries;
    public List<String> genres;
    public List<CastsBean> casts;
    public List<DirectorsBean> directors;
    public List<String> aka;

    public static class RatingBean {
        /**
         * max : 10
         * average : 8.4
         * stars : 45
         * min : 0
         */

        public int max;
        public double average;
        public String stars;
        public int min;
    }

    public static class ImagesBean {
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg
         */
        public String small;
        public String large;
        public String medium;
    }

    public static class CastsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1016681/
         * avatars : {"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg"}
         * name : 小罗伯特·唐尼
         * id : 1016681
         */

        public String alt;
        public AvatarsBean avatars;
        public String name;
        public String id;

        public static class AvatarsBean {
            /**
             * small : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg
             * large : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg
             * medium : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.jpg
             */

            public String small;
            public String large;
            public String medium;
        }
    }

    public static class DirectorsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1321812/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg"}
         * name : 安东尼·罗素
         * id : 1321812
         */

        public String alt;
        public AvatarsBeanX avatars;
        public String name;
        public String id;

        public static class AvatarsBeanX {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.jpg
             */

            public String small;
            public String large;
            public String medium;
        }
    }
}
