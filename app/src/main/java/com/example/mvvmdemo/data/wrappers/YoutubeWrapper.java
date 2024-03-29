package com.example.mvvmdemo.data.wrappers;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YoutubeWrapper {


    /**
     * id : 299534
     * results : [{"id":"5c8a4d5b0e0a267d08c32f18","iso_639_1":"en","iso_3166_1":"US","key":"hA6hldpSTF8","name":"Marvel Studios' Avengers - Official Trailer","site":"YouTube","size":1080,"type":"Trailer"},{"id":"5c8a4d740e0a26042bc441ef","iso_639_1":"en","iso_3166_1":"US","key":"TcMBFSGVi1c","name":"Marvel Studios' Avengers: Endgame - Official Trailer","site":"YouTube","size":1080,"type":"Trailer"},{"id":"5c93af740e0a261053e9026d","iso_639_1":"en","iso_3166_1":"US","key":"-iFq6IcAxBc","name":"Marvel Studios' Avengers: Endgame - Big Game TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5c93d507c3a3682e5ff166b2","iso_639_1":"en","iso_3166_1":"US","key":"3h4cAU2Jz_Q","name":"Marvel Studios\u2019 Avengers: Endgame | \u201cHonor\u201d TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5c9a8757c3a36873193cea4f","iso_639_1":"en","iso_3166_1":"US","key":"zTGdTEHvRoc","name":"Marvel Studios' Avengers Endgame | \"We Lost\" Featurette","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5ca36bfbc3a3682b1610f181","iso_639_1":"en","iso_3166_1":"US","key":"KCSNFZKbhZE","name":"Marvel Studios\u2019 Avengers: Endgame | Special Look","site":"YouTube","size":1080,"type":"Trailer"},{"id":"5ca8d163925141566efe2b96","iso_639_1":"en","iso_3166_1":"US","key":"unJzy1XwQ2k","name":"Marvel Studios' Avengers: Endgame | \"Stakes\" Featurette","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cab81a39251415654026037","iso_639_1":"en","iso_3166_1":"US","key":"9QbltzIUV6w","name":"Marvel Studios\u2019 Avengers: Endgame | Film Clip","site":"YouTube","size":1080,"type":"Clip"},{"id":"5caf6576c3a3683c22aa9bfa","iso_639_1":"en","iso_3166_1":"US","key":"81UOofW82FY","name":"Marvel Studios' Avengers: Endgame | \"Mission\" Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cb4b0fc9251412fa329eabe","iso_639_1":"en","iso_3166_1":"US","key":"Td1diFNqe6c","name":"Marvel Studios' Avengers: Endgame | \"No Mistakes, Kids\" TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cb5e6b9c3a3686b0481c5f2","iso_639_1":"en","iso_3166_1":"US","key":"0jNvJU52LvU","name":"Marvel Studios\u2019 Avengers: Endgame | \u201cTo the End\u201d TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cb765f50e0a266ba4ef60fc","iso_639_1":"en","iso_3166_1":"US","key":"S_32rARQ5yw","name":"Marvel Studios\u2019 Avengers: Endgame | \u201cAwesome\u201d TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cb7663b0e0a266ba4ef612b","iso_639_1":"en","iso_3166_1":"US","key":"vnAKVlnQTzY","name":"Russo Brothers Interview Avengers Endgame","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cb8a83c92514108dbf805c6","iso_639_1":"en","iso_3166_1":"US","key":"v0bClKEy1HA","name":"Marvel Studios\u2019 Avengers: Endgame | \u201cFound\u201d TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cbd509a0e0a261a55f2b62b","iso_639_1":"en","iso_3166_1":"US","key":"tijLYuIjrxw","name":"Marvel Studios\u2019 Avengers: Endgame | \u201cPowerful\u201d TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cbe0f0e92514108d8ffc3a1","iso_639_1":"en","iso_3166_1":"US","key":"yR_7h9b2OPo","name":"Marvel Studios' Avengers: Endgame | \"Time\" TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cbe8cb392514108d80060bc","iso_639_1":"en","iso_3166_1":"US","key":"5xyNqemLNxk","name":"Marvel Studios' Avengers: Endgame | LIVE Red Carpet World Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbe906992514108d800636c","iso_639_1":"en","iso_3166_1":"US","key":"0ESZs5OYwuw","name":"Scarlett Johansson & Chris Pratt take over at Avengers: Endgame LIVE Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea31692514151cafab298","iso_639_1":"en","iso_3166_1":"US","key":"5ZvcuFF2ffo","name":"Benedict Wong's Marvel Journey LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea32392514108d800746a","iso_639_1":"en","iso_3166_1":"US","key":"73TEwTxSUjk","name":"Hiroyuki Sanada joins the MCU LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea3ae0e0a2615fdf1f36e","iso_639_1":"en","iso_3166_1":"US","key":"ZTPKBznD7eg","name":"Avengers: Endgame Executive Producer Louis D'Esposito LIVE at the Red Carpet Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea3c292514108d8007512","iso_639_1":"en","iso_3166_1":"US","key":"lhZr-Vk1RKk","name":"Composer Alan Silvestri on the Final Avengers Score LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea418c3a36809ab803d90","iso_639_1":"en","iso_3166_1":"US","key":"JohLpoEFwx4","name":"Karen Gillan talks Nebula's Journey LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea444c3a3686b0b8fee2a","iso_639_1":"en","iso_3166_1":"US","key":"GMUNfOsKd-k","name":"Taika Waititi Brings the Party to the LIVE Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea4520e0a2615fdf1f47b","iso_639_1":"en","iso_3166_1":"US","key":"o0MsvHxFDC8","name":"Laurence Fishburne on growing up reading Marvel Comics at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea496c3a3687f8f87ef4e","iso_639_1":"en","iso_3166_1":"US","key":"xNiBNz61LRI","name":"Kevin Feige talks the expansive MCU LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea4a992514108d80075dd","iso_639_1":"en","iso_3166_1":"US","key":"p5fthh_F4SM","name":"Linda Cardellini talks keeping secrets at the LIVE Marvel Studios' Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea4ba0e0a2615fdf1f4d6","iso_639_1":"en","iso_3166_1":"US","key":"N2QLF5yKUf0","name":"Elizabeth Olsen on Scarlet Witch and Vision LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea4d2c3a36809ab803e19","iso_639_1":"en","iso_3166_1":"US","key":"0X10T__DDfE","name":"Danai Gurira and Paul Rudd Talk the Snap LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea4e292514108d8007607","iso_639_1":"en","iso_3166_1":"US","key":"o4mXzaCxkok","name":"Don Cheadle talks what makes a real world hero LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea4f2c3a368694c891836","iso_639_1":"en","iso_3166_1":"US","key":"Dyo7Kbijr98","name":"Jeremy Renner talks prepping as Hawkeye for Avengers: Endgame at the World Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea507925141066efaae29","iso_639_1":"en","iso_3166_1":"US","key":"1L6mMs_hr4k","name":"Neal Kirby talks about his father, Jack Kirby's, Marvel Legacy at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea5160e0a2615fdf1f51d","iso_639_1":"en","iso_3166_1":"US","key":"gNW20bP1Kdo","name":"Robert Downey Jr & Jon Favreau talk 10 years of Iron Man at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea54f0e0a266b96fa5e52","iso_639_1":"en","iso_3166_1":"US","key":"dTSQjc8cegY","name":"Danai Gurira talks working with the surviving Avengers LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea55e0e0a2641edf480f9","iso_639_1":"en","iso_3166_1":"US","key":"jBleVtbciI0","name":"Bob Iger on the legacy of Marvel LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea571c3a36809ab803e79","iso_639_1":"en","iso_3166_1":"US","key":"L41F3mw89mY","name":"Christopher Markus & Stephen McFeely (Screenwriters) LIVE from the Avengers: Endgame Red Carpet","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea57f0e0a261a55f48a52","iso_639_1":"en","iso_3166_1":"US","key":"PV_79Nr07e8","name":"Anthony Mackie talks Falcon's fate LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea58cc3a368596a8084f0","iso_639_1":"en","iso_3166_1":"US","key":"QV9GCWg2u2A","name":"Benedict Cumberbatch on working with the Russo Brothers LIVE on the Avengers: Endgame Red Carpet","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea5d492514108d10008a0","iso_639_1":"en","iso_3166_1":"US","key":"vwfVWFOPBCY","name":"Brie Larson talks Captain Marvel joining the team LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea5f3c3a36809ab803f03","iso_639_1":"en","iso_3166_1":"US","key":"GJLcCgS7Mzw","name":"Paul Rudd hopes Ant-Man is in Avengers: Endgame","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea6000e0a2615fdf1f5e5","iso_639_1":"en","iso_3166_1":"US","key":"H3_l1DIbLvU","name":"Gwyneth Paltrow on Pepper Potts through the years at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea63ac3a36872c98a8e7b","iso_639_1":"en","iso_3166_1":"US","key":"EnRzM4bE6M4","name":"Directors Anthony and Joe Russo on a journey's end LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea6c492514151cafab58a","iso_639_1":"en","iso_3166_1":"US","key":"a6Yib8P5Xr4","name":"Vin Diesel feels his \"Groot-ness\" LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea6fe925141066efaafea","iso_639_1":"en","iso_3166_1":"US","key":"0hWwnPV502c","name":"Tessa Thompson on suriving the snap at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7890e0a26105af44c9b","iso_639_1":"en","iso_3166_1":"US","key":"G3mpwCsvpQ0","name":"Clark Gregg looks back on Coulson LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7990e0a266b96fa603d","iso_639_1":"en","iso_3166_1":"US","key":"9nusLMvCTsI","name":"Letitia Wright reacts to Shuri getting snapped by Thanos LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7a8c3a368694c891aed","iso_639_1":"en","iso_3166_1":"US","key":"_sh7eWx4jqE","name":"Emma Lahana and Ally Maki bring the Mayhem LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7b9c3a36872c98a9021","iso_639_1":"en","iso_3166_1":"US","key":"5rCdDerNNXk","name":"David Dastmalchian LIVE from the Avengers: Endgame Red Carpet Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7cbc3a36809ab80418b","iso_639_1":"en","iso_3166_1":"US","key":"mtcqn3HQ-Uw","name":"Cobie Smulders Talks About Maria Hill's Connecting Role LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7df9251417d39fad131","iso_639_1":"en","iso_3166_1":"US","key":"F0VjvcyZTvA","name":"Natalie Portman talks girl power in the Marvel Universe LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea7f90e0a2654e9f01ef4","iso_639_1":"en","iso_3166_1":"US","key":"v5U5_U-0udc","name":"Letitia Wright and Pom Klementieff talk filming LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea8100e0a2615fdf1f841","iso_639_1":"en","iso_3166_1":"US","key":"ELAJHo2apmE","name":"S.H.I.E.L.D. Director Henry Simmons LIVE at the Avengers: Endgame Premier","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea82dc3a3687f8f87f386","iso_639_1":"en","iso_3166_1":"US","key":"ak3Kg52IT1k","name":"Agents of S.H.I.E.L.D. Natalia Cordova-Buckley LIVE from the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea843c3a36872c98a90ed","iso_639_1":"en","iso_3166_1":"US","key":"KbRO_a44yA0","name":"Agents of S.H.I.E.L.D. Ming-Na Wen LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea85492514108d1000b46","iso_639_1":"en","iso_3166_1":"US","key":"6slAQbysMyk","name":"Thanos Creator Jim Starlin LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea86a925141097dfa9193","iso_639_1":"en","iso_3166_1":"US","key":"aOQYHWZ9VUw","name":"Sean Gunn LIVE from the Avengers Endgame Red Carpet Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cbea8799251412577f975c9","iso_639_1":"en","iso_3166_1":"US","key":"zlNlkwB27lU","name":"Marvel Studios' Avengers: Endgame Red Carpet | Best Moments!","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cc0b939925141097dfd158f","iso_639_1":"en","iso_3166_1":"US","key":"1VBJ-kNsmaQ","name":"Marvel Studios' Avengers: Endgame | Paul Rudd Exclusive Look","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cc11f42925141097dfdc335","iso_639_1":"en","iso_3166_1":"US","key":"RBfggCYNWNk","name":"Marvel Studios\u2019 Avengers: Endgame | \u201cGo\u201d TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cc11f5a0e0a2654e9f395db","iso_639_1":"en","iso_3166_1":"US","key":"Bqp_zK09NZ8","name":"Sebastian Stan talks the end of the line LIVE at the Avengers: Endgame Premiere","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cc11f910e0a266b96fdbe8c","iso_639_1":"en","iso_3166_1":"US","key":"-xtbxLRUREs","name":"Mark Ruffalo, Chris Hemsworth & Anthony Mackie Try Not to Spoil Avengers: Endgame at the Red Carpet","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cc11fbd925141066efdbbed","iso_639_1":"en","iso_3166_1":"US","key":"kwo0wSabwBk","name":"Marvel Studios' Avengers: Endgame | \"Everything\" TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cc1cd580e0a260b0fece2a8","iso_639_1":"en","iso_3166_1":"US","key":"n92qDDd9E1U","name":"Marvel Studios' Avengers: Endgame | Big Review TV Spot","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5cc34c9ac3a368776c8ff6f2","iso_639_1":"en","iso_3166_1":"US","key":"AMSITikqKiM","name":"Marvel Studios' Avengers: Endgame | Policy Trailer","site":"YouTube","size":1080,"type":"Trailer"},{"id":"5cc5bee3c3a3683ad5818227","iso_639_1":"en","iso_3166_1":"US","key":"F6d-LqmvLsA","name":"Audi \u201cThe Debriefing\u201d - Marvel Studios\u2019 Avengers: Endgame","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5cc5dcb59251415cd2f96dc1","iso_639_1":"en","iso_3166_1":"US","key":"QIHmrnvLhBg","name":"The Making of Avengers: Endgame | Part 1 | Filmed with IMAX® Cameras","site":"YouTube","size":1080,"type":"Behind the Scenes"},{"id":"5cc6ab75c3a3683ad5831972","iso_639_1":"en","iso_3166_1":"US","key":"A5H9dPaZp_8","name":"The Making of Avengers: Endgame | Part 2 | Filmed with IMAX® Cameras","site":"YouTube","size":1080,"type":"Behind the Scenes"}]
     */

    @SerializedName("id")
    private int id;
    @SerializedName("results")
    private List<ResultsBean> results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * id : 5c8a4d5b0e0a267d08c32f18
         * iso_639_1 : en
         * iso_3166_1 : US
         * key : hA6hldpSTF8
         * name : Marvel Studios' Avengers - Official Trailer
         * site : YouTube
         * size : 1080
         * type : Trailer
         */

        @SerializedName("id")
        private String id;
        @SerializedName("iso_639_1")
        private String iso6391;
        @SerializedName("iso_3166_1")
        private String iso31661;
        @SerializedName("key")
        private String key;
        @SerializedName("name")
        private String name;
        @SerializedName("site")
        private String site;
        @SerializedName("size")
        private int size;
        @SerializedName("type")
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
