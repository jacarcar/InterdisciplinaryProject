import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Carpenter_Final extends PApplet {

PImage img;
float r,g,b;
boolean Img1, Img2, Img3, Img4, Img5, Img6, Img7, Img8;
boolean picLoaded, Effect1, Effect2, Effect3, Effect4;
boolean Effect5, Effect6, Effect7, Effect8, Effect9;
boolean Effectr, Effectg, Effectb;
boolean Txt1, Txt2, Txt3, Txt4, Txt5, Txt6, Txt7, Txt8;
int picWidth, picHeight, opacity, x, y= 0;

public void setup()
{
  
  textSize(30);
  background(0);
  fill(255);
  textAlign(CENTER);
  
  if(Txt1)
  {
    text("e,r,g,b keys do something for image 1",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt2)
  {
    text("-,= keys do something for image 2",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt3)
  {
    text("-,=,t keys do something for image 3",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt4)
  {
    text("r,b keys do something for image 4",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt5)
  {
    text("up,down,left,right keys do something for image 5",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt6)
  {
    text("i,d keys do something for image 6",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt7)
  {
    text("f,p keys do something for image 7",displayWidth/2,(displayHeight)/2);
  }
  
  else if(Txt8)
  {
    text("r,g keys do something for image 8",displayWidth/2,(displayHeight)/2);
  }
  
  else
  {
    text("Situations",displayWidth/2,(displayHeight)/2-90);
    text("Press 1,2,3,4,5,6,7,8 for the images",displayWidth/2,(displayHeight)/2-30);
    text("0 to get back here",displayWidth/2,(displayHeight)/2+30);
    text("Press shift+number to see what keys do something for that image",displayWidth/2,(displayHeight)/2+90);
  }
}

public void draw()
{
  int picStart, picEnd = 0;
  if(keyPressed)
  {
    if(key == '1')
    {
      Img2 = false;
      Img1 = true;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Coal1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '2')
    {
      Img1 = false;
      Img2 = true;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Destiny1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '3')
    {
      Img1 = false;
      Img2 = false;
      Img3 = true;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Selfie1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      opacity = 255;
      tint(opacity, opacity);
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '4')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = true;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Code1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '5')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = true;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Bottle1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '6')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = true;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Dolphin1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '7')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = true;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Mustang1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '8')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = true;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      picLoaded = true;
      background(0);
      img = loadImage("Tennis1.JPG");
      picWidth = img.width;
      picHeight = img.height;
      x = 0;
      y = 0;
      
      if(picWidth > displayWidth)
      {
        picHeight = (int)(picHeight*((float)displayWidth/picWidth));
        picWidth = displayWidth;
      }
      
      if(picHeight > displayHeight)
      {
        picWidth = (int)(picWidth*((float)displayHeight/picHeight));
        picHeight = displayHeight;
      }
    }
    
    else if(key == '0')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      Txt1 = false;
      Txt2 = false;
      Txt3 = false;
      Txt4 = false;
      Txt5 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = false;
      img = null;
      picLoaded = false;
      setup();
    }
    
    else if(key == '!')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt1 = true;
      Txt2 = false;
      Txt3 = false;
      Txt4 = false;
      Txt5 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = false;
      setup();
    }
    
    else if(key == '@')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt2 = true;
      Txt1 = false;
      Txt3 = false;
      Txt4 = false;
      Txt5 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = false;
      setup();
    }
    
    else if(key == '#')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt3 = true;
      Txt1 = false;
      Txt2 = false;
      Txt4 = false;
      Txt5 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = false;
      setup();
    }
    
    else if(key == '$')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt4 = true;
      Txt1 = false;
      Txt2 = false;
      Txt3 = false;
      Txt5 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = false;
      setup();
    }
    
    else if(key == '%')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt5 = true;
      Txt1 = false;
      Txt2 = false;
      Txt3 = false;
      Txt4 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = false;
      setup();
    }
    
    else if(key == '^')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt5 = false;
      Txt1 = false;
      Txt2 = false;
      Txt3 = false;
      Txt4 = false;
      Txt6 = true;
      Txt7 = false;
      Txt8 = false;
      setup();
    }
    
    else if(key == '&')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt5 = false;
      Txt1 = false;
      Txt2 = false;
      Txt3 = false;
      Txt4 = false;
      Txt6 = false;
      Txt7 = true;
      Txt8 = false;
      setup();
    }
    
    else if(key == '*')
    {
      Img1 = false;
      Img2 = false;
      Img3 = false;
      Img4 = false;
      Img5 = false;
      Img6 = false;
      Img7 = false;
      Img8 = false;
      Effect1 = false;
      Effect2 = false;
      Effect3 = false;
      Effect4 = false;
      Effect5 = false;
      Effect6 = false;
      Effect7 = false;
      Effect8 = false;
      Effect9 = false;
      Effectr = false;
      Effectg = false;
      Effectb = false;
      img = null;
      picLoaded = false;
      Txt5 = false;
      Txt1 = false;
      Txt2 = false;
      Txt3 = false;
      Txt4 = false;
      Txt6 = false;
      Txt7 = false;
      Txt8 = true;
      setup();
    }
  }
  
  if(picLoaded)
  {
    background(0);
    float ratio = img.width/ (float)img.height;
    picStart= 0;
    picEnd = displayWidth*displayHeight;
    image(img, (displayWidth-picWidth)/2+x, (displayHeight-picHeight)/2+y,picWidth,picHeight);
    loadPixels();
    
    if(Effect1)
    {
      img.filter(ERODE);
    }
    
    if(Effect2)
    {
      img.filter(DILATE);
    }
    
    if(Effect3)
    {
      img.filter(POSTERIZE,255);
    }
    
    if(Effect4)
    {
      img.filter(THRESHOLD);
    }
    
    if(!Effect4 && Img3)
    {
      img = loadImage("Selfie1.JPG"); 
    }
    
    if(Effect5)
    {
      
      int i = picStart;
      while(i < picEnd/2)
      {
        r = red(pixels[i]);
        g = green(pixels[i]);
        b = blue(pixels[i]);
        int newColor = color(r,g,b);
        pixels[picEnd-1-i] = newColor;
        i += 1;
      }
      updatePixels();
      redraw();
    }
    
    if(Effect6)
    {
      img.filter(BLUR);
    }
    if(Effect7)
    {
      for(int j=0; j<displayHeight;j++)
      {
        int i = picStart;
        while(i < displayWidth/2)
        {
          r = red(pixels[i+(j*displayWidth)]);
          g = green(pixels[i+(j*displayWidth)]);
          b = blue(pixels[i+(j*displayWidth)]);
          int newColor = color(r,g,b);
          pixels[displayWidth-i+(j*displayWidth)-1] = newColor;
          i+=1;
        }
      }
      updatePixels();
      redraw();
    }
    if(Effect8)
    {
      
      int i = picStart;
      while(i < picEnd/2)
      {
        r = red(pixels[i]);
        g = green(pixels[i]);
        b = blue(pixels[i]);
        int newColor = color(r,g,b);
        float r1 = red(pixels[picEnd-1-i]);
        float g1 = green(pixels[picEnd-1-i]);
        float b1 = blue(pixels[picEnd-1-i]);
        int newColor1 = color(r1,g1,b1);
        pixels[i] = newColor1;
        pixels[picEnd-1-i] = newColor;
        i += 1;
      }
      updatePixels();
      redraw();
    }
    
    if(Effect9)
    {
      img.filter(GRAY);
    }
    else if(!Effect9 && Img8)
    {
      img = loadImage("Tennis1.JPG");
    }
    
    if(Effectr)
    {
      int i = picStart;
      while(i < picEnd)
      {
        int c = pixels[i];
        r = (red(c)*2);
        pixels[i] = color(r,0,0);
        i+=1;
      }
      updatePixels();
      redraw(); 
    }
    
    if(Effectg)
    {
      int i = picStart;
      while(i < picEnd)
      {
        int c = pixels[i];
        g = (green(c)*2);
        pixels[i] = color(0,g,0);
        i+=1;
      }
      updatePixels();
      redraw();
    }
    
    if(Effectb)
    {
      int i = picStart;
      while(i < picEnd)
      {
        int c = pixels[i];
        b = (blue(c)*2);
        pixels[i] = color(0,0,b);
        i+=1;
      }
      updatePixels();
      redraw();
    }
    
    if(Img1)
    {
    }
    
    else if(Img2)
    {
      if(keyPressed)
      {
        if(key == '=')
        {
          if(picWidth <= img.width*2)
          {
            picWidth = picWidth+50;
            picHeight = (int)(picWidth/ratio);
          }
          
          else if(picWidth <= img.width*4)
          {
            picWidth = picWidth+150;
            picHeight = (int)(picWidth/ratio);
          }
        }
        
        if(key == '-')
        {
          if(picWidth > 50)
          {
            picWidth = picWidth-50;
            picHeight = (int)(picWidth/ratio);
          }
          
          else if(picWidth > 1 && picHeight > 1)
          {
            picWidth = picWidth-1;
            picHeight = (int)(picWidth/ratio);
          }
        }
      }
    }
    
    else if(Img3)
    {
      if(keyPressed)
      {
        if(key == '-')
        {
          if(opacity > 0)
          {
            tint(opacity, opacity-15);
            opacity -= 15;
          }
          
          else if(opacity == 0)
          {
            tint(opacity, opacity);
          }
        }
        if(key == '=')
        {
          if(opacity < 255)
          {
            opacity +=15;
            tint(opacity, opacity);
          }
        }
      }
    }
    
    else if(Img4)
    {
    }
    
    else if(Img5)
    {
      if(keyPressed)
      {
        if(key == CODED)
        {
          if(keyCode == UP)
          {
            if(y > -displayHeight/2)
            {
              y = y-50;
            }
          }
          
          if(keyCode == DOWN)
          {
            if(y < displayHeight/2)
            {
              y = y+50;
            }
          }
          
          if(keyCode == LEFT)
          {
            if(x > -displayWidth/2)
            {
              x = x-50;
            }
          }
          
          if(keyCode == RIGHT)
          {
            if(x < displayWidth/2)
            {
              x = x+50;
            }
          }
        }
      }
    }
    
    else if(Img6)
    {
    }
    
    else if(Img7)
    {
    }
    
    else if(Img8)
    {
    }
    
    else
    {
      setup();
    }
  }
}

public void keyReleased()
{
  if(Img1)
  {
    if(key == 'e' || key == 'E')
    {
      Effect1 = !Effect1;
    }
    
    if(key == 'r' || key == 'R')
    {
      Effectr = !Effectr;
      Effectg = false;
      Effectb = false;
    }
    
    if(key == 'g' || key == 'G')
    {
      Effectg = !Effectg;
      Effectr = false;
      Effectb = false;
    }
    
    if(key == 'b' || key == 'B')
    {
      Effectb = !Effectb;
      Effectg = false;
      Effectr = false;
    }
  }
  
  if(Img3)
  {
    if(key == 't' || key == 'T')
    {
      Effect4 = !Effect4;
    }
  }
  
  if(Img4)
  {
    if(key == 'r' || key == 'R')
    {
      Effect5 = !Effect5;
    }
    if(key == 'b' || key == 'B')
    {
      Effect6 = !Effect6;
    }
  }
  
  if(Img6)
  {
    if(key == 'i' || key == 'I')
    {
      img.filter(INVERT);
    }
    
    if(key == 'd' || key == 'D')
    {
      Effect2 = !Effect2;
    }
  }
  
  if(Img7)
  {
    if(key == 'f' || key == 'F')
    {
      Effect8 = !Effect8;
    }
    
    if(key == 'p' || key == 'P')
    {
      Effect3 = !Effect3;
    }
  }
  
  if(Img8)
  {
    if(key == 'r' || key == 'R')
    {
      Effect7 = !Effect7;
    }
    
    if(key == 'g' || key == 'G')
    {
      Effect9 = !Effect9;
    }
  }
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Carpenter_Final" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
