public class test1 {
    private String id;
    private String loginName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("test1{");
        sb.append("id='").append(id).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {


    }

    public test1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
