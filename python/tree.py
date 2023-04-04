class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None
class Tree:
    def addvalue(self,root,value):
        new_node=Node(value)
        if value<root.data:
            if root.left==None:
                root.left=new_node
            else:
                self.addvalue(root.left,value)
        else:
            if root.right==None:
                root.right=new_node
            else:
                self.addvalue(root.right,value)
    def inorder(self,root):
        if root.left!=None:
            self.inorder(root.left)
        print(root.data,end=" ")
        if root.right!=None:
            self.inorder(root.right)
    def preorder(self,root):
        print(root.data,end=" ")
        if root.left!=None:
            self.preorder(root.left)
        if root.right!=None:
            self.preorder(root.right)
    def postorder(self,root):
        if root.left!=None:
            self.postorder(root.left)
        if root.right!=None:
            self.postorder(root.right)
        print(root.data,end=" ")
    def level_order(self,root):
        q=[root]
        while len(q)!=0:
            ele=q.pop(0)
            print(ele.data,end=' ')
            if ele.left!=None:
                q.append(ele.left)
            if ele.right!=None:
                q.append(ele.right)
    def sum(self,root):
        res=root.data
        if root.left!=None:
            res+=self.sum(root.left)
        if root.right!=None:
            res+=self.sum(root.right)
        return res
    def height(self,root):
        if root == None:
            return -1
        left_height=self.height(root.left)
        right_height=self.height(root.right)
        return 1+max(left_height,right_height)
ob=Tree()
root=Node(10)
ob.addvalue(root,5)
ob.addvalue(root,15)
ob.addvalue(root,2)
ob.addvalue(root,6)
ob.addvalue(root,12)
ob.addvalue(root,17)
ob.preorder(root)
print()
ob.postorder(root)
print()
ob.inorder(root)
print()
ob.level_order(root)
print()
print(ob.sum(root.left)*ob.sum(root.right))
print(ob.height(root))