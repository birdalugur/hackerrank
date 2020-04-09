void increment(int *v)
{
    (*v)++;
}

void increment2(int v)
{
    printf('%d', v);
    (v)++;
}

int main()
{
    int a;
    scanf("%d", &a);
    increment2(&a);
    printf("%d", a);
    return 0;
}