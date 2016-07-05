#include<iostream>
#include<stdlib.h>
#include<string.h>
#include<dos.h>
using namespace std;
struct Node{
  int data;
  Node* left;
  Node* right;
};

Node* GetNewNode(int data){
 Node* tmp= new Node();
 tmp->data=data;
 tmp->left=NULL;
 tmp->right=NULL;
 return tmp;
}
Node* Insert(Node* root,int data){
    if(root==NULL){
      root=GetNewNode(data);
      return root;
    }
    else if(data<=root->data){
        root->left=Insert(root->left,data);
    }
    else{
        root->right=Insert(root->right,data);
    }

    return root;
}
void DisplayInPreorder(Node* root){
    //cout<<root->data<<" ";
    if(root==NULL)return;
    cout<<root->data<<" ";
    DisplayInPreorder(root->left);
    DisplayInPreorder(root->right);
}
void DisplayInInorder(Node* root){
    //cout<<root->data<<" ";
    if(root==NULL)return;
    DisplayInPreorder(root->left);
    cout<<root->data<<" ";
    DisplayInPreorder(root->right);
}
void DisplayInPostorder(Node* root){
    //cout<<root->data<<" ";
    if(root==NULL)return;
    DisplayInPreorder(root->left);
    DisplayInPreorder(root->right);
    cout<<root->data<<" ";
}
int main(){
 Node* root=NULL;
 int data,op;
 cout<<"\nChoose options:->Binary Search Tree.................."<<endl;
 while(1){
    cout<<"\n\t1.Insert new Element:"<<endl;
    cout<<"\t2.Delete element"<<endl;
    cout<<"\t3.Display in PreOrder"<<endl;
    cout<<"\t4.Display in Inorder"<<endl;
    cout<<"\t5.Display in PostOrder"<<endl;
    cout<<"\t6.Exit"<<endl;
    cout<<"\tselect one of the above option: ";
    cin>>op;

    switch(op){
       case 1:
       {
         cout<<"Enter Element: ";
         cin>>data;
         root=Insert(root,data);
         break;
       }
       case 2:
       {
         break;
       }
       case 3:
       {
          cout<<"Preorder is: ";
          DisplayInPreorder(root);
          break;
       }
       case 4:
       {
          cout<<"Inorder is: ";
          DisplayInInorder(root);
          break;
       }
       case 5:
       {
          cout<<"Postorder is: ";
          DisplayInPostorder(root);
          break;
       }
       case 6:
       {
          exit(1);
          break;
       }
       default:
        {
            cout<<"ERROR....choose valid option!"<<endl;
            break;
        }
        }
    }
 }
