package B_May_Code.ex_25052024;

public enum APIEndpoints {
    HOME("https://vwo.com/home","Home Page"),
    LOGIN("https://vwo.com/login","Login Page"),
    DASHBOARD("https://vwo.com/dashboard","Dashboard Page");
    String url;
    String page;

    APIEndpoints(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
