public enum Direccio {
    NORD, SUD, EST, OEST;

    public static Direccio desDeString(String text) {
        try {
            return Direccio.valueOf(text.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}