package p98programmers;

class Solution42576 {
    public String solution(String[] participant, String[] completion) {
        
        for (int i = 0; i < participant.length; i++) {
            String p = participant[i];
            boolean pcompletion = false;
            
            for (int j = 0; j < completion.length; j++) {
                String c = completion[j];
                
                if (p.equals(c)) {
                    pcompletion = true;
                    completion[j] = "";
                    break;
                }
            }
            
            if (!pcompletion) {
                return p;
            }
        }
        return null;   
    }
}
