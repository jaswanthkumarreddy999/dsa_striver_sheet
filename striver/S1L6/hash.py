size = int(input())
map = {}
for i in range(0,size):
    num = int(input())
    map[num] = map.get(num,0)+1
key = int(input())
print(map.get(key))
