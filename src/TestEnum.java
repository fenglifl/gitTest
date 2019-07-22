public enum TestEnum {
    WAIT_PAY(0, "待支付"),
    ALREADY_PAY(1, "已支付");
    private int code;
    private String desc;

    TestEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static int getCodeByDesc(String desc) {
        for (TestEnum testEnum : TestEnum.values()) {
            if (testEnum.desc.equals(desc)) {
                return testEnum.code;
            }
        }
        return 0;
    }

    public static String getDescByCode(int code) {
        for (TestEnum testEnum : TestEnum.values()) {
            if (testEnum.code == code) {
                return testEnum.desc;
            }
        }
        return null;
    }
}
