package com.example.mvvmdemo.data.wrappers;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDetailsWrapper {


    /**
     * adult : false
     * backdrop_path : /7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg
     * belongs_to_collection : {"id":86311,"name":"The Avengers Collection","poster_path":"/qJawKUQcIBha507UahUlX0keOT7.jpg","backdrop_path":"/zuW6fOiusv4X9nnW3paHGfXcSll.jpg"}
     * budget : 500000000
     * genres : [{"id":12,"name":"Adventure"},{"id":878,"name":"Science Fiction"},{"id":28,"name":"Action"}]
     * homepage : https://www.marvel.com/movies/avengers-endgame
     * id : 299534
     * imdb_id : tt4154796
     * original_language : en
     * original_title : Avengers: Endgame
     * overview : After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.
     * popularity : 482.931
     * poster_path : /or06FN3Dka5tukK1e9sl16pB3iy.jpg
     * production_companies : [{"id":420,"logo_path":"/hUzeosd33nzE5MCNsZxCGEKTXaQ.png","name":"Marvel Studios","origin_country":"US"}]
     * production_countries : [{"iso_3166_1":"US","name":"United States of America"}]
     * release_date : 2019-04-24
     * revenue : 1914531638
     * runtime : 181
     * spoken_languages : [{"iso_639_1":"en","name":"English"}]
     * status : Released
     * tagline : Part of the journey is the end.
     * title : Avengers: Endgame
     * video : false
     * vote_average : 8.6
     * vote_count : 4010
     */

    @SerializedName("adult")
    private boolean adult;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("belongs_to_collection")
    private BelongsToCollectionBean belongsToCollection;

    @Override
    public String toString() {
        return "MovieDetailsWrapper{" +
                "adult=" + adult +
                ", backdropPath='" + backdropPath + '\'' +
                ", belongsToCollection=" + belongsToCollection +
                ", budget=" + budget +
                ", homepage='" + homepage + '\'' +
                ", id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", posterPath='" + posterPath + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", revenue=" + revenue +
                ", runtime=" + runtime +
                ", status='" + status + '\'' +
                ", tagline='" + tagline + '\'' +
                ", title='" + title + '\'' +
                ", video=" + video +
                ", voteAverage=" + voteAverage +
                ", voteCount=" + voteCount +
                ", genres=" + genres +
                ", productionCompanies=" + productionCompanies +
                ", productionCountries=" + productionCountries +
                ", spokenLanguages=" + spokenLanguages +
                '}';
    }

    @SerializedName("budget")
    private int budget;
    @SerializedName("homepage")
    private String homepage;
    @SerializedName("id")
    private int id;
    @SerializedName("imdb_id")
    private String imdbId;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("overview")
    private String overview;
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("revenue")
    private Long revenue;
    @SerializedName("runtime")
    private int runtime;
    @SerializedName("status")
    private String status;
    @SerializedName("tagline")
    private String tagline;
    @SerializedName("title")
    private String title;
    @SerializedName("video")
    private boolean video;
    @SerializedName("vote_average")
    private double voteAverage;
    @SerializedName("vote_count")
    private int voteCount;
    @SerializedName("genres")
    private List<GenresBean> genres;
    @SerializedName("production_companies")
    private List<ProductionCompaniesBean> productionCompanies;
    @SerializedName("production_countries")
    private List<ProductionCountriesBean> productionCountries;
    @SerializedName("spoken_languages")
    private List<SpokenLanguagesBean> spokenLanguages;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public BelongsToCollectionBean getBelongsToCollection() {
        return belongsToCollection;
    }

    public void setBelongsToCollection(BelongsToCollectionBean belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
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

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public List<GenresBean> getGenres() {
        return genres;
    }

    public void setGenres(List<GenresBean> genres) {
        this.genres = genres;
    }

    public List<ProductionCompaniesBean> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompaniesBean> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<ProductionCountriesBean> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(List<ProductionCountriesBean> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public List<SpokenLanguagesBean> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(List<SpokenLanguagesBean> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public static class BelongsToCollectionBean {
        /**
         * id : 86311
         * name : The Avengers Collection
         * poster_path : /qJawKUQcIBha507UahUlX0keOT7.jpg
         * backdrop_path : /zuW6fOiusv4X9nnW3paHGfXcSll.jpg
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("backdrop_path")
        private String backdropPath;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }
    }

    public static class GenresBean {
        /**
         * id : 12
         * name : Adventure
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ProductionCompaniesBean {
        /**
         * id : 420
         * logo_path : /hUzeosd33nzE5MCNsZxCGEKTXaQ.png
         * name : Marvel Studios
         * origin_country : US
         */

        @SerializedName("id")
        private int id;
        @SerializedName("logo_path")
        private String logoPath;
        @SerializedName("name")
        private String name;
        @SerializedName("origin_country")
        private String originCountry;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public void setLogoPath(String logoPath) {
            this.logoPath = logoPath;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }
    }

    public static class ProductionCountriesBean {
        /**
         * iso_3166_1 : US
         * name : United States of America
         */

        @SerializedName("iso_3166_1")
        private String iso31661;
        @SerializedName("name")
        private String name;

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SpokenLanguagesBean {
        /**
         * iso_639_1 : en
         * name : English
         */

        @SerializedName("iso_639_1")
        private String iso6391;
        @SerializedName("name")
        private String name;

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
