# 연습문제 (12.4)
camille = {
    'health': 575.6,
    'health_regen': 1.7,
    'mana': 338.8,
    'mana_regen': 1.63,
    'melee': 125,
    'attack_damage': 60,
    'attack_speed': 0.625,
    'armor': 26,
    'magic_resistance': 32.1,
    'movement_speed': 340
}
print(camille['health'])
print(camille['movement_speed'])

# 심사문제
my_dict = {}

key = input().split()
value = input().split()

for i in range(len(key)):
    my_dict[key[i]] = value[i]

print(my_dict)
