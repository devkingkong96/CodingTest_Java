#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    int answer = 0;
    if(0<angle&&angle<90)
        return angle=1;
    else if(angle==90)
        return angle=2;
    else if(90<angle&&angle<180)
        return angle=3;
    else if(angle==180)
        return angle=4;
    return answer;
}