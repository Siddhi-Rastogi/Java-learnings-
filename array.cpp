#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() {
        head = NULL;
    }

    void insertAtEnd(int value) {
        Node* newNode = new Node(value);

        if (head == NULL) {
            head = newNode;
            return;
        }

        Node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }

        temp->next = newNode;
    }

    void insertAtPosition(int value, int pos) {
        Node* newNode = new Node(value);

        if (pos == 1) {
            newNode->next = head;
            head = newNode;
            return;
        }

        Node* temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == NULL) {
                cout << "Position out of range\n";
                return;
            }
            temp=temp->next;
        }

        newNode->next=temp->next;
        temp->next= newNode;
    }

    void display() {
        Node* temp = head;
        while (temp != NULL) {
            cout << temp->data << " -> ";
            temp=temp->next;
        }
        cout << "NULL"<<endl;
    }
};

int main() {
    LinkedList list;

   insertAtEnd(10);
   insertAtEnd(20);
   insertAtEnd(30);
   list.display();

    list.insertAtPosition(90,2);

    list.display();

    return 0;
}