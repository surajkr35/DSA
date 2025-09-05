#include <stdio.h>
#include <stdlib.h>

// Node structure
struct Node {
    int coeff;
    int pow;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int coeff, int pow) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->coeff = coeff;
    newNode->pow = pow;
    newNode->next = NULL;
    return newNode;
}

// Insert a term to the polynomial
void insertTerm(struct Node** poly, int coeff, int pow) {
    struct Node* newNode = createNode(coeff, pow);
    if (*poly == NULL) {
        *poly = newNode;
        return;
    }

    struct Node* temp = *poly;
    while (temp->next != NULL)
        temp = temp->next;
    temp->next = newNode;
}

// Function to add two polynomials
struct Node* addPolynomials(struct Node* poly1, struct Node* poly2) {
    struct Node* result = NULL;

    while (poly1 != NULL && poly2 != NULL) {
        if (poly1->pow > poly2->pow) {
            insertTerm(&result, poly1->coeff, poly1->pow);
            poly1 = poly1->next;
        } else if (poly1->pow < poly2->pow) {
            insertTerm(&result, poly2->coeff, poly2->pow);
            poly2 = poly2->next;
        } else {
            int sum = poly1->coeff + poly2->coeff;
            if (sum != 0) {
                insertTerm(&result, sum, poly1->pow);
            }
            poly1 = poly1->next;
            poly2 = poly2->next;
        }
    }

    // insert remaining terms
    while (poly1 != NULL) {
        insertTerm(&result, poly1->coeff, poly1->pow);
        poly1 = poly1->next;
    }
    while (poly2 != NULL) {
        insertTerm(&result, poly2->coeff, poly2->pow);
        poly2 = poly2->next;
    }

    return result;
}

// Print the polynomial
void printPolynomial(struct Node* poly) {
    while (poly != NULL) {
        printf("%dx^%d", poly->coeff, poly->pow);
        if (poly->next != NULL)
            printf(" + ");
        poly = poly->next;
    }
    printf("\n");
}

// Main function
int main() {
    struct Node* poly1 = NULL;
    struct Node* poly2 = NULL;
    struct Node* result = NULL;

    // Create first polynomial: 3x^3 + 2x^2 + 5
    insertTerm(&poly1, 3, 3);
    insertTerm(&poly1, 2, 2);
    insertTerm(&poly1, 5, 0);

    // Create second polynomial: 4x^2 + 2x + 5
    insertTerm(&poly2, 4, 2);
    insertTerm(&poly2, 2, 1);
    insertTerm(&poly2, 5, 0);

    printf("First Polynomial : ");
    printPolynomial(poly1);

    printf("Second Polynomial: ");
    printPolynomial(poly2);

    result = addPolynomials(poly1, poly2);

    printf("Sum Polynomial   : ");
    printPolynomial(result);

    return 0;
}
