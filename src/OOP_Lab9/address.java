package OOP_Lab9;

public class address {
    private String homeNo;
    private String province;
    private String postCode;

    public address(String homeNo, String province, String postCode) {
        this.homeNo = homeNo;
        this.province = province;
        this.postCode = postCode;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "address{" +
                "homeNo='" + homeNo + '\'' +
                ", province='" + province + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
