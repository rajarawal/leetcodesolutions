 public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2)
            return false;
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        for(int i = 0 ; i < n1 ; i++){
            char1[s.charAt(i) -'a']++;
            char2[t.charAt(i) -'a']++;
        }
        for(int i = 0 ; i < 26; i++){
            if(char1[i] != char2[i])
                return false;
        }
        return true;
    }
