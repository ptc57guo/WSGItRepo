'''
Created on Jul 5, 2018

@author: 312504
'''
from Room import Room
from Box import Box
class Warehouse:
    '''
    classdocs
    '''
    rooms = []
    def __init__(self, listOfRooms):
        self.rooms = listOfRooms
    
    
    def addBox(self, box):
        for currentRoom in self.rooms:
            if box.boxHazardous:
                if (currentRoom.hazardousContents and currentRoom.currentVolume <= box.boxVolume) or len(currentRoom.boxes) == 0:
                    currentRoom.addBox(box)
                    break
            elif box.boxVolume <= currentRoom.currentVolume:
                    currentRoom.addBox(box)
                    break
            else:
                print("No space for box {}".format(box.boxId))       
   
    
myWarehouse = Warehouse([Room(1, 70, False), Room(2, 130, False), Room(3, 40, False), Room(4, 45, False)])  
myWarehouse.addBox(Box(1, 10, False))
myWarehouse.addBox(Box(2, 40, False))          
myWarehouse.addBox(Box(3, 25, False))          
myWarehouse.addBox(Box(4, 15, False))          
myWarehouse.addBox(Box(5, 15, True))          
myWarehouse.addBox(Box(6, 45, True))          
myWarehouse.addBox(Box(7, 15, False))          
myWarehouse.addBox(Box(8, 15, True))          

for thisRoom in myWarehouse.rooms:
    for thisBox in thisRoom.boxes:
        print("Room {} contains box {}".format(thisRoom.roomId, thisBox.boxId))
