'''
Created on Jul 5, 2018

@author: 312504
'''

class Box:
    '''
    classdocs
    '''


    def __init__(self, boxId, boxVolume, hazardous):
        
        self._boxId = boxId 
        self._boxVolume = boxVolume
        self._boxHazardous = hazardous
        
    @property
    def boxId(self):
        return self._boxId
    @boxId.setter
    def boxId(self, value):
        self._boxId = value
        
    @property
    def boxVolume(self):
        return self._boxVolume
    @boxVolume.setter 
    def boxVolume(self, value):
        self._boxVolume = value 
        
    @property
    def boxHazardous(self):
        return self._boxHazardous
    @boxHazardous.setter 
    def boxHazardous(self, value):
        self._boxHazardous = value 
                