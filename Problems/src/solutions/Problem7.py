# Good morning! Here's your coding interview problem for today.
#
# This problem was asked by Facebook.
#
# Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
#
# For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
#
# You can assume that the messages are decodable. For example, '001' is not allowed.

message = "35"

def allowed(code):
    return 26 >= int(code) > 0

def decode(msg):
    if len(msg) == 1:
        count = 1
    elif len(msg) == 2:
        count = 1 + allowed(int(msg))
    else:
        count = decode(msg[1:])
        if allowed(msg[:2]):
            count += decode(msg[2:])
    return count


print(decode(message))
