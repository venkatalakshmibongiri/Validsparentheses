class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length(),i=0;
        if(n<=1 || n%2!=0)
        {
            return false;
        }
        while(n!=0)
        {
           char c = s.charAt(i);
           if(c=='(' || c=='{'||c=='[')
           {
               st.push(c);
           }
           else
           {
                 if(!st.isEmpty())
                 {
                     if(c==')' && st.peek()=='(')
                     {
                            st.pop();
                     }
                     else if(c=='}' && st.peek()=='{')
                     {
                            st.pop();
                     }
                      else if(c==']' && st.peek()=='[')
                     {
                           st.pop();
                     }
                     else
                     {
                          return false;
                     }
                }
                else
                {
                       return false;
                }    
          }
        i++;            
        n--;
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}

Output______________________________________________________________________________
input   "()"
output  true


