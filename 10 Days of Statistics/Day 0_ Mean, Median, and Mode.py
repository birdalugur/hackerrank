from collections import Counter

n = int(input())


x = list(map(float, input().split()))[:n]


def get_mean(x):
    return round(sum(x)/len(x), 1)


def get_median(x):
    import statistics
    return statistics.median(x)


def get_mode(x):
    c = Counter(x)
    v = c.most_common()
    current = v.pop(0)
    while v:
        if len(current) == 0:
            break
        next_ = v.pop(0)
        if next_[1] == current[1]:
            if next_[0] < current[0]:
                current = next_
        else:
            pass
    return current[0]


print(get_mean(x))
print(get_median(x))
print(get_mode(x))
