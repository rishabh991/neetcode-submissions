class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str.length()).append(":").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;

        while(i<str.length()){

            int colonIndex = str.indexOf(":",i);

            int strLen = Integer.parseInt(str.substring(i,colonIndex));

            res.add(str.substring(colonIndex+1,colonIndex+strLen+1)); //last index is exclusive, so +1

            i=colonIndex+strLen+1;
        }

        return res;

    }
}
