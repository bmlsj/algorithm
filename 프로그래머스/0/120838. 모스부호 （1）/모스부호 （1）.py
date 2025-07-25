def solution(letter):
    
    morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
    }
    
    answer = ''
    tmp = ''
    
    words = letter.split(' ')
    for let in words:
        tmp += let
        for key in morse.keys():
            if tmp == key:
                answer += morse[key]
                tmp = ''
                break
        
    return answer