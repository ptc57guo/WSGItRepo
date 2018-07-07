'''
Created on Jul 5, 2018

@author: 312504
'''
class Room(object):
    '''
    classdocs
    '''
    def __init__(self, roomId, roomVolume, hazardousContents):
        self._roomId = roomId
        self._roomVolume = roomVolume
        self._hazardousContents = hazardousContents
        self._currentVolume = roomVolume
        self._boxes = []

    def addBox(self, box):
        self._boxes.append(box)
        self._currentVolume = self._currentVolume - box.boxVolume
        if box.boxHazardous:
            self._hazardousContents = True
                
    @property
    def roomId(self):
        return self._roomId
    @roomId.setter
    def roomId(self, value):
        self._roomId = value   
        
    @property
    def roomVolume(self):
        return self._roomVolume
    @roomVolume.setter 
    def roomVolume(self, value):
        self._roomVolume = value
        
    @property
    def hazardousContents(self):
        return self._hazardousContents
    @hazardousContents.setter 
    def hazardousContents(self, value):
        self._hazardousContents = value   
        
    @property
    def currentVolume(self):
        return self._currentVolume 
   
    @property
    def boxes(self):
        return self._boxes  
        
        