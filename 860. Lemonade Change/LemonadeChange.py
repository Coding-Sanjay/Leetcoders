class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        
        amt5Count = 0
        amt10Count = 0

        for i in range(0, len(bills)): 
            if (bills[i] == 10):
                amt10Count += 1

                if (amt5Count != 0):
                    amt5Count -= 1
                else:
                    return False
                
            elif (bills[i] == 20):

                if (amt10Count != 0 and amt5Count != 0):
                    amt10Count -= 1
                    amt5Count -= 1
                elif (amt5Count >= 3):
                    amt5Count -= 3
                else:
                    return False
            
            else:
                amt5Count += 1

        return True
