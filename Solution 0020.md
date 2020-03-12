# 0020 有效的括号

## 解题思路1

一开始想用if-else 但是比较复杂，之后再想到用堆栈，其实不用每个字符都放进栈中，把左括号对应的右括号放进栈即可，砍了一半的可能。

先循环每一个字符，把右边的括号放入栈中，然后当c!=stack.pop()；返回false；

```

```

![image-20200312195400140](Solution 0020.assets/image-20200312195400140.png)

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}
```

