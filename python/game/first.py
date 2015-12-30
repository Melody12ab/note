#!/usr/bin/python2

backgroud_image_filename='/home/xiaobai/Wallpaper/213.jpg'
mouse_image_filename='/home/xiaobai/Pictures/123.jpg'

import pygame 

from pygame.locals import *
from sys import exit
pygame.init()
screen=pygame.display.set_mode((640,480),0,32)
pygame.display.set_caption("hello Pygame!")
background=pygame.image.load(backgroud_image_filename).convert()
mouse_cursor=pygame.image.load(mouse_image_filename).convert_alpha()

while True:
    for event in pygame.event.get():
        if event.type==QUIT:
            exit()

    screen.blit(background,(0,0))

    x,y=pygame.mouse.get_pos()
    x-=mouse_cursor.get_width()/2
    y-=mouse_cursor.get_height()/2

    screen.blit(mouse_cursor,(x,y))

    pygame.display.update() 
