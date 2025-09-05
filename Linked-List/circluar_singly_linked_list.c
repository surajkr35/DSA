#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

int main()
{
    struct node *head = NULL, *second = NULL, *third = NULL;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));

    head->data = 10;
    head->next = second;
    second->data = 20;
    second->next = third;
    third->data = 30;
    third->next = head;

    struct node *temp = head;
    printf("Circular linked list \n");

    do
    {
        printf("%d ->", temp->data);
        temp = temp->next;
    } while (temp != head);

    printf("NULL \n");

    return 0;
}