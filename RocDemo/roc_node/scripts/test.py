# float mapfloat(float x, float in_min, float in_max, float out_min, float out_max)
# {
#     return
# }

if __name__ == "__main__":
    in_min = -0.45
    in_max = 0.45
    out_min = 20
    out_max = 90

    x = 0.45

    result = (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min
    print(result)
