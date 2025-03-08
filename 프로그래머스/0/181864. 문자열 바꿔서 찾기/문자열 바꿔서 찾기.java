class Solution {
    public int solution(String myString, String pat) {
        
        
        myString = myString.replace("A","C");
        myString = myString.replace("B","A");
        myString = myString.replace("C","B");
        System.out.print(myString);
        int answer = 0;
        if(myString.contains(pat)){
            answer = 1;

        }
        return answer;
    }
}