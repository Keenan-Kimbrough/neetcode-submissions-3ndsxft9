class Solution:
    def isValid(self, s: str) -> bool:
        closeToOpen = {
            ')':'(',
            '}':'{',
            ']':'['
        }

        stack = []

        for string in s:
            if string in closeToOpen:

                if stack and stack[-1] == closeToOpen[string]:
                    stack.pop()

                else: 
                    return False
            else:
                stack.append(string)
        return True if not stack else False
 