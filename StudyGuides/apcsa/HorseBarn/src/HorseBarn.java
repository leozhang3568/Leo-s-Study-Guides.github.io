public class HorseBarn {
    private Horse[] spaces;
    public int findHorseSpace (String name) {
        for (int i = 0; i < spaces.length; i++) {
            if ((spaces[i] != null) &&(spaces[i].getName()).equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate () {
        int j;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                j = i+1;
                while (j < spaces.length) {
                    if (spaces[j] != null) {
                        spaces[i] = spaces[j];
                        spaces[j] = null;
                        break;
                    }
                    j++;
                }
            }
        }
    }
}