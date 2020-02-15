package yuhao.enums;

/**
 * @author 喻浩
 * @create 2020-02-12-13:04
 */
public enum RespBeanEnum {
    SUCCESS(200,"成功"),
    FAIL_PARS(201,"参数错误"),
    UNKNOW_ERROR(202,"未知错误"),
    SIGN_ERROR(203,"签名错误"),
    TOKEN_ERROR(204,"无访问权限"),
    CONTENTTYPE_ERROR(205,"Content-Type错误"),
    METHOD_ERROR(206,"访问方法错误"),

    SMS_SEND_FAIL(1001,"短信发送失败"),

    NO_PERSON(2001,"暂无此人信息"),
    APPLY_FAIL(207,"请求失败");

    private Integer result_code;

    private String message;
    
    RespBeanEnum(Integer result_code, String message) {
        this.result_code = result_code;
        this.message = message;
    }

    public static RespBeanEnum getResultEnumWithParsErr(String msg)
    {
        FAIL_PARS.message=msg;
        return FAIL_PARS;
    }

    public Integer getResult_code() {
        return result_code;
    }

    public void setResult_code(Integer result_code) {
        this.result_code = result_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
