package com.example.mvvmdemo.data.wrappers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.example.mvvmdemo.data.local.GenreConverter;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MovieWrapper {


    /**
     * page : 1
     * total_results : 414052
     * total_pages : 20703
     * results : [{"vote_count":3728,"id":299534,"video":false,"vote_average":8.7,"title":"Avengers: Endgame","popularity":488.627,"poster_path":"/or06FN3Dka5tukK1e9sl16pB3iy.jpg","original_language":"en","original_title":"Avengers: Endgame","genre_ids":[12,878,28],"backdrop_path":"/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg","adult":false,"overview":"After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.","release_date":"2019-04-24"},{"vote_count":4532,"id":299537,"video":false,"vote_average":7.1,"title":"Captain Marvel","popularity":320.493,"poster_path":"/AtsgWhDnHTq68L0lLsUrCnM7TjG.jpg","original_language":"en","original_title":"Captain Marvel","genre_ids":[28,12,878],"backdrop_path":"/w2PMyoyLU22YvrGK3smVM9fW1jj.jpg","adult":false,"overview":"The story follows Carol Danvers as she becomes one of the universe\u2019s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe.","release_date":"2019-03-06"},{"vote_count":289,"id":456740,"video":false,"vote_average":5.2,"title":"Hellboy","popularity":247.427,"poster_path":"/bk8LyaMqUtaQ9hUShuvFznQYQKR.jpg","original_language":"en","original_title":"Hellboy","genre_ids":[28,12,14],"backdrop_path":"/5BkSkNtfrnTuKOtTaZhl8avn4wU.jpg","adult":false,"overview":"Hellboy comes to England, where he must defeat Nimue, Merlin's consort and the Blood Queen. But their battle will bring about the end of the world, a fate he desperately tries to turn away.","release_date":"2019-04-10"},{"vote_count":737,"id":537915,"video":false,"vote_average":6.2,"title":"After","popularity":231.87,"poster_path":"/u3B2YKUjWABcxXZ6Nm9h10hLUbh.jpg","original_language":"en","original_title":"After","genre_ids":[18,10749],"backdrop_path":"/8lESY7UGpOsbL2caib9Qe4bOebF.jpg","adult":false,"overview":"A young woman falls for a guy with a dark secret and the two embark on a rocky relationship.","release_date":"2019-04-11"},{"vote_count":13211,"id":299536,"video":false,"vote_average":8.3,"title":"Avengers: Infinity War","popularity":227.909,"poster_path":"/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","original_language":"en","original_title":"Avengers: Infinity War","genre_ids":[12,28,14],"backdrop_path":"/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg","adult":false,"overview":"As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","release_date":"2018-04-25"},{"vote_count":1362,"id":287947,"video":false,"vote_average":7.2,"title":"Shazam!","popularity":196.967,"poster_path":"/xnopI5Xtky18MPhK40cZAGAOVeV.jpg","original_language":"en","original_title":"Shazam!","genre_ids":[35,12,14],"backdrop_path":"/bi4jh0Kt0uuZGsGJoUUfqmbrjQg.jpg","adult":false,"overview":"A boy is given the ability to become an adult superhero in times of need with a single magic word.","release_date":"2019-03-23"},{"vote_count":14,"id":495925,"video":false,"vote_average":5.9,"title":"Doraemon the Movie: Nobita's Treasure Island","popularity":167.034,"poster_path":"/cmJ71gdZxCqkMUvGwWgSg3MK7pC.jpg","original_language":"ja","original_title":"映画ドラえもん のび太の宝島","genre_ids":[16],"backdrop_path":"/8OamoIWfC9zmhwhh1PPaBcDoQaH.jpg","adult":false,"overview":"The story is based on Robert Louis Stevenson's Treasure Island novel.","release_date":"2018-03-03"},{"vote_count":19159,"id":24428,"video":false,"vote_average":7.6,"title":"The Avengers","popularity":162.068,"poster_path":"/cezWGskPY5x7GaglTTRN4Fugfb8.jpg","original_language":"en","original_title":"The Avengers","genre_ids":[878,28,12],"backdrop_path":"/hbn46fQaRmlpBuUrEiFqv0GDL6Y.jpg","adult":false,"overview":"When an unexpected enemy emerges and threatens global safety and security, Nick Fury, director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins!","release_date":"2012-04-25"},{"vote_count":370,"id":438650,"video":false,"vote_average":5.3,"title":"Cold Pursuit","popularity":160.085,"poster_path":"/otK0H9H1w3JVGJjad5Kzx3Z9kt2.jpg","original_language":"en","original_title":"Cold Pursuit","genre_ids":[28,18,53,80],"backdrop_path":"/aiM3XxYE2JvW1vJ4AC6cI1RjAoT.jpg","adult":false,"overview":"Nels Coxman's quiet life comes crashing down when his beloved son dies under mysterious circumstances. His search for the truth soon becomes a quest for revenge as he seeks coldblooded justice against a drug lord and his inner circle.","release_date":"2019-02-07"},{"vote_count":13014,"id":99861,"video":false,"vote_average":7.3,"title":"Avengers: Age of Ultron","popularity":152.142,"poster_path":"/t90Y3G8UGQp0f0DrP60wRu9gfrH.jpg","original_language":"en","original_title":"Avengers: Age of Ultron","genre_ids":[28,12,878],"backdrop_path":"/rFtsE7Lhlc2jRWF7SRAU0fvrveQ.jpg","adult":false,"overview":"When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth\u2019s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure.","release_date":"2015-04-22"},{"vote_count":2583,"id":450465,"video":false,"vote_average":6.5,"title":"Glass","popularity":114.466,"poster_path":"/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg","original_language":"en","original_title":"Glass","genre_ids":[53,9648,18,14,878],"backdrop_path":"/lvjscO8wmpEbIfOEZi92Je8Ktlg.jpg","adult":false,"overview":"In a series of escalating encounters, security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.","release_date":"2019-01-16"},{"vote_count":14,"id":576393,"video":false,"vote_average":5.8,"title":"Fall in Love at First Kiss","popularity":113.624,"poster_path":"/wtaSH8MfJSCEIrrEX9SQuHdU5sl.jpg","original_language":"zh","original_title":"一吻定情","genre_ids":[10749,35],"backdrop_path":"/yY7kr7Rgvo8W0Kr3U0bMV8Zq1qM.jpg","adult":false,"overview":"After an earthquake destroys Xiang Qin's house, she and her father move in with the family of her father's college buddy. To her surprise, her new kind and amicable aunt and uncle are the parents of her cold and distant schoolmate, Jiang Zhi Shu, a genius with an IQ of 200 whom not too long ago rejected her when she confessed her feelings for him. Will the close proximity give her a second chance to win Zhi Shu's heart? Or will her love for him end under his cold words?","release_date":"2019-02-14"},{"vote_count":11867,"id":284054,"video":false,"vote_average":7.4,"title":"Black Panther","popularity":108.05,"poster_path":"/uxzzxijgPIY7slzFvMotPv8wjKA.jpg","original_language":"en","original_title":"Black Panther","genre_ids":[28,12,14,878],"backdrop_path":"/6ELJEzQJ3Y45HczvreC3dg0GV5R.jpg","adult":false,"overview":"King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.","release_date":"2018-02-13"},{"vote_count":61,"id":535167,"video":false,"vote_average":6.7,"title":"The Wandering Earth","popularity":105.528,"poster_path":"/tXuQCgx69DxVgeTsU0TkruR3i9O.jpg","original_language":"zh","original_title":"The Wandering Earth","genre_ids":[878,28,18,35],"backdrop_path":"/m5OlkBJZKTlMGJUaxMDINplKBRp.jpg","adult":false,"overview":"When the Sun begins to expand in such a way that it will inevitably engulf and destroy the Earth in a hundred years, united mankind finds a way to avoid extinction by propelling the planet out of the Solar System using gigantic engines, moving it to a new home located four light years away, an epic journey that will last thousands of years.","release_date":"2019-02-05"},{"vote_count":10985,"id":284053,"video":false,"vote_average":7.5,"title":"Thor: Ragnarok","popularity":98.548,"poster_path":"/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg","original_language":"en","original_title":"Thor: Ragnarok","genre_ids":[28,12,35,14],"backdrop_path":"/kaIfm5ryEOwYg8mLbq8HkPuM1Fo.jpg","adult":false,"overview":"Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.","release_date":"2017-10-25"},{"vote_count":11,"id":447404,"video":false,"vote_average":6.4,"title":"POKÉMON Detective Pikachu","popularity":97.309,"poster_path":"/wgQ7APnFpf1TuviKHXeEe3KnsTV.jpg","original_language":"en","original_title":"POKÉMON Detective Pikachu","genre_ids":[9648,10751,80,14],"backdrop_path":"/yXybBEC45p84D0Ky7GmQQYrclVr.jpg","adult":false,"overview":"In a world where people collect pocket-size monsters (pokemon) to do battle, a boy comes across an intelligent monster who seeks to be a detective.","release_date":"2019-05-03"},{"vote_count":11,"id":543103,"video":false,"vote_average":4.9,"title":"Kamen Rider Heisei Generations FOREVER","popularity":93.691,"poster_path":"/6sOFQDlkY6El1B2P5gklzJfVdsT.jpg","original_language":"ja","original_title":"仮面ライダー平成ジェネレーションズFOREVER","genre_ids":[28,12,878],"backdrop_path":"/uufTqD2CSn1NqL3cXEl4Vp3bCav.jpg","adult":false,"overview":"In the world of Sougo Tokiwa and Sento Kiryu, their \"companions\" are losing their memories one after the other as they're replaced by other people. The Super Time Jacker, Tid , appears before them. He orders his powerful underlings, Another Double and Another Den-O, to pursue a young boy called Shingo. While fighting to protect Shingo, Sougo meets Ataru, a young man who loves Riders, but Ataru says that Kamen Riders aren't real. What is the meaning of those words? While the mystery deepens, the true enemy that Sougo and Sento must defeat appears in the Kuriogatake mountain...","release_date":"2018-12-22"},{"vote_count":137,"id":445629,"video":false,"vote_average":6.4,"title":"Fighting with My Family","popularity":93.271,"poster_path":"/3TZCBAdKQiz0cGKGEjZiyZUA01O.jpg","original_language":"en","original_title":"Fighting with My Family","genre_ids":[35,18],"backdrop_path":"/mYKP6qcDUimVMAHQWLOuDHjO19S.jpg","adult":false,"overview":"Born into a tight-knit wrestling family, Paige and her brother Zak are ecstatic when they get the once-in-a-lifetime opportunity to try out for the WWE. But when only Paige earns a spot in the competitive training program, she must leave her loved ones behind and face this new cutthroat world alone. Paige's journey pushes her to dig deep and ultimately prove to the world that what makes her different is the very thing that can make her a star.","release_date":"2019-02-14"},{"vote_count":12137,"id":283995,"video":false,"vote_average":7.7,"title":"Guardians of the Galaxy Vol. 2","popularity":91.88,"poster_path":"/y4MBh0EjBlMuOzv9axM4qJlmhzz.jpg","original_language":"en","original_title":"Guardians of the Galaxy Vol. 2","genre_ids":[28,12,35,878],"backdrop_path":"/aJn9XeesqsrSLKcHfHP4u5985hn.jpg","adult":false,"overview":"The Guardians must fight to keep their newfound family together as they unravel the mysteries of Peter Quill's true parentage.","release_date":"2017-04-19"},{"vote_count":203,"id":487297,"video":false,"vote_average":5.8,"title":"What Men Want","popularity":90.796,"poster_path":"/30IiwvIRqPGjUV0bxJkZfnSiCL.jpg","original_language":"en","original_title":"What Men Want","genre_ids":[35,14,10749],"backdrop_path":"/wbAQKi2E5cO0Utk5KDk9yX3kuOu.jpg","adult":false,"overview":"Magically able to hear what men are thinking, a sports agent uses her newfound ability to turn the tables on her overbearing male colleagues.","release_date":"2019-02-08"}]
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Entity
    public static class ResultsBean implements Parcelable {
        /**
         * vote_count : 3728
         * id : 299534
         * video : false
         * vote_average : 8.7
         * title : Avengers: Endgame
         * popularity : 488.627
         * poster_path : /or06FN3Dka5tukK1e9sl16pB3iy.jpg
         * original_language : en
         * original_title : Avengers: Endgame
         * genre_ids : [12,878,28]
         * backdrop_path : /7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg
         * adult : false
         * overview : After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.
         * release_date : 2019-04-24
         */

        @SerializedName("vote_count")
        private int voteCount;
        @PrimaryKey
        @SerializedName("id")
        private int id;
        @SerializedName("video")
        private boolean video;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("title")
        private String title;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("original_title")
        private String originalTitle;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("adult")
        private boolean adult;
        @SerializedName("overview")
        private String overview;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("genre_ids")
        @TypeConverters(GenreConverter.class)
        private List<Integer> genreIds;

        private boolean isFavorite;

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public boolean isFavorite() {
            return isFavorite;
        }

        public void setFavorite(boolean favorite) {
            isFavorite = favorite;
        }

        @NotNull
        @Override
        public String toString() {
            return "{" +
                    "voteCount=" + voteCount +
                    ", id=" + id +
                    ", video=" + video +
                    ", voteAverage=" + voteAverage +
                    ", title='" + title + '\'' +
                    ", popularity=" + popularity +
                    ", posterPath='" + posterPath + '\'' +
                    ", originalLanguage='" + originalLanguage + '\'' +
                    ", originalTitle='" + originalTitle + '\'' +
                    ", backdropPath='" + backdropPath + '\'' +
                    ", adult=" + adult +
                    ", overview='" + overview + '\'' +
                    ", releaseDate='" + releaseDate + '\'' +
                    ", genreIds=" + genreIds +
                    ", isFavorite=" + isFavorite +
                    '}';
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.voteCount);
            dest.writeInt(this.id);
            dest.writeByte(this.video ? (byte) 1 : (byte) 0);
            dest.writeDouble(this.voteAverage);
            dest.writeString(this.title);
            dest.writeDouble(this.popularity);
            dest.writeString(this.posterPath);
            dest.writeString(this.originalLanguage);
            dest.writeString(this.originalTitle);
            dest.writeString(this.backdropPath);
            dest.writeByte(this.adult ? (byte) 1 : (byte) 0);
            dest.writeString(this.overview);
            dest.writeString(this.releaseDate);
            dest.writeList(this.genreIds);
            dest.writeByte(this.isFavorite ? (byte) 1 : (byte) 0);
        }

        public ResultsBean() {
        }

        protected ResultsBean(Parcel in) {
            this.voteCount = in.readInt();
            this.id = in.readInt();
            this.video = in.readByte() != 0;
            this.voteAverage = in.readDouble();
            this.title = in.readString();
            this.popularity = in.readDouble();
            this.posterPath = in.readString();
            this.originalLanguage = in.readString();
            this.originalTitle = in.readString();
            this.backdropPath = in.readString();
            this.adult = in.readByte() != 0;
            this.overview = in.readString();
            this.releaseDate = in.readString();
            this.genreIds = new ArrayList<Integer>();
            in.readList(this.genreIds, Integer.class.getClassLoader());
            this.isFavorite = in.readByte() != 0;
        }

        public static final Creator<ResultsBean> CREATOR = new Creator<ResultsBean>() {
            @Override
            public ResultsBean createFromParcel(Parcel source) {
                return new ResultsBean(source);
            }

            @Override
            public ResultsBean[] newArray(int size) {
                return new ResultsBean[size];
            }
        };
    }
}
