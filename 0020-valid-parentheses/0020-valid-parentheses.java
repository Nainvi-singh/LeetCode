class Solution {
    public boolean isValid(String s) {
        //campare with previous brackets
        //maintain a stack
        //maintain opening closing pair
        Map<Character,Character> pair =new HashMap<>();
        pair.put('(',')');
        pair.put('{','}');
        pair.put('[',']');
        Stack<Character> stack=new Stack<>();
        char brackets[]=s.toCharArray();
        for(char bracket: brackets){
            //if opening, push in a stack
            if(pair.containsKey(bracket)){
                stack.push(bracket);
            }
            //if closing, pop opening from the stack and thrn compare it
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char openingBracket = stack.pop();
                char closingBracket=pair.get(openingBracket);
                if(closingBracket!=bracket){
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
}