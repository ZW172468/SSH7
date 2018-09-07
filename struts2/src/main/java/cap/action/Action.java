package cap.action;

public interface Action {
    //定义Action接口里包含的一些结果字符串
    public static final String ERROR = "error";
    public static final String INPUT = "input";
    public static final String LOGIN = "login";
    public static final String NONE = "none";
    public static final String SUCCESS = "success";

    //定义处理用户请求的execute()方法
    public String execute() throws Exception;
}
