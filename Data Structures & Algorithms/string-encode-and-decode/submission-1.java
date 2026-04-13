class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hashIndex = str.indexOf("#",i);
            int len = Integer.valueOf(str.substring(i,hashIndex));
            String s = str.substring(hashIndex+1, hashIndex+len+1);
            result.add(s);
            i=hashIndex+len+1;
        }

        return result;
    }
}
