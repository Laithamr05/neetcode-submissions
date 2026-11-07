class Solution {
    public boolean isPalindrome(String s) {
        s= s.replace(" ","");
        s=s.toLowerCase();
       s=s.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = s.toCharArray();
        if(arr.length==1)
            return true;
        if(arr.length==2 && arr[0]!=arr[1])
            return false;
        int i =0;
        int j =arr.length-1;
        int mid=arr.length/2;
        while(i<j){
            if(arr[i]!=arr[j])
                return false;
            i++;
            j--;

        }
        return true;
    }
}
