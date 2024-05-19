package cs307.cs30724springproject2.entity;

public class station {

    private int id;

    private String district;

    private String englishName;

    private String chineseName;

    private String intro;

    public station(Integer id, String district, String englishName, String chineseName, String intro) {
        this.id = id;
        this.district = district;
        this.englishName = englishName;
        this.chineseName = chineseName;
        this.intro = intro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}