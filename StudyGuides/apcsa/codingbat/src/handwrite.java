public class handwrite {
    public static void main(String [] args) {
        System.out.println(isValidID("aB9081"));
    }
    public static boolean isValidID(String id) {   
        if (id.length() != 6) {
            return false;
        }
        String val = ""; int comp;
        for (int i = 0; i < 6; i++) {
            val = id.substring(i,i+1);
            if (i < 2) {
                comp = val.compareTo("A");
                System.out.println(comp);
                if (!(((comp<25) && (comp >= 0)) || ((comp < 57) && (comp >= 32)))) {
                    return false;
                }
            }
            if (i >= 2) {
                comp = val.compareTo("0");
                if (!((comp >= 0) && (comp <= 9))) {
                    return false;
                }
            }
        }
        return true;
    }
}
