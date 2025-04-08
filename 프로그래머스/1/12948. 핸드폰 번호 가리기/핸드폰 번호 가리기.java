class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if(phone_number.length()>=4 && phone_number.length()<=20){
            char[] phone = new char[phone_number.length()];
            phone = phone_number.toCharArray();
            for(int i=0; i<phone_number.length()-4; i++){
                phone[i] = '*';
            }
            answer = new String(phone);
            return answer;
        }
        else {
            return answer;
        }
    }
}