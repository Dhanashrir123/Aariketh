package com.actionsdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class Action extends BaseClass  {
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor ) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public static void click(WebDriver ldriver,WebElement locatorName) {
		Actions act = new Actions(ldriver);
		act.moveToElement(locatorName).click().build().perform();
	}
	public static boolean findElement(WebDriver ldriver,WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag=true;
		}finally {
			if(flag) {
				System.out.println("Successfully found element at");
				
			}else {
				System.out.println("Unable to locate element at");
			}
		}
		return flag;
	}
	public static boolean isDisplayed(WebDriver ldriver,WebElement ele) {
		boolean flag=false;
		flag=findElement(ldriver,ele);
		if(flag) {
			flag =ele.isDisplayed();
			if (flag) {
				System.out.println("The element is Displayed");
				
			}else {
				System.out.println("The element is not Displayed");
			}
			
		}else {
			System.out.println("Not displayed");
		}
		return flag;
	}
	public static boolean isSelected(WebDriver ldriver,WebElement ele) {
		boolean flag=false;
		flag=findElement(ldriver,ele);
		if(flag) {
			flag =ele.isSelected();
			if (flag) {
				System.out.println("The element is Selected");
				
			}else {
				System.out.println("The element is not Selected");
			}
			
		}else {
			System.out.println("Not selected");
		}
		return flag;
	}
	public static boolean isEnabled(WebDriver ldriver,WebElement ele) {
		boolean flag=false;
		flag=findElement(ldriver,ele);
		if(flag) {
			flag =ele.isSelected();
			if (flag) {
				System.out.println("The element is Enabled");
				
			}else {
				System.out.println("The element is not Enabled");
			}
			
		}else {
			System.out.println("Not Enabled");
		}
		return flag;
	
}
	
	public static boolean type(WebDriver ldriver, WebElement ele, String text) {
	    boolean flag = false;
	    flag = findElement(ldriver, ele);
	    try {
	        if (flag) {
	            ele.clear();
	            ele.sendKeys(text);
	            flag = true;
	        } else {
	            System.out.println("Element not found");
	        }
	    } catch (Exception e) {
	        System.out.println("Failed to enter value: " + e.getMessage());
	    } finally {
	        if (flag) {
	            System.out.println("Successfully entered value");
	        } else {
	            System.out.println("Unable to enter value");
	        }
	    }
	    return flag;
	}
	
	public static boolean selectBySendskeys(WebElement ele,String value) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		}finally {
			if (flag) {
				System.out.println("Select value from the DropDown");
			}else {
				System.out.println("Not Selected value from the DropDown");
			}}
		}
		
		public static boolean selectByIndex(WebElement element,int index) {
			boolean flag =false;
			try{
				Select s = new Select(element);
				s.selectByIndex(index);
				flag = true;
				return true;
			} catch (Exception e) {
				return false;
			}finally {
				if (flag) {
					System.out.println("Option selected by Index");
					}
				else {
					System.out.println("Option not selected by Index");
				}
			}}
			public static boolean selectByValue(WebElement element,String value) {
			boolean flag = false;
			try {
				Select s= new Select(element);
				s.selectByValue(value);
				flag=true;
				return true;
			}catch(Exception e) {
				return false;
			}finally {
				if (flag) {
					System.out.println("Option selected by Value");
					}
				else {
					System.out.println("Option not selected by Value");
				}
			}
			}
				public static boolean selectByVisibleText(String visibletext ,WebElement ele) {
					boolean flag =false;
					try {
						Select s = new Select(ele);
						s.selectByVisibleText(visibletext);
						flag = true;
						return true;
					}catch (Exception e) {
						return false;
					}finally {
						if (flag) {
							System.out.println("Option selected by VisibleText");
							}
						else {
							System.out.println("Option not selected by VisibleText");
						}
					}
				}
				public static boolean mouseHoverByJavaScript(WebDriver driver, WebElement locator) {
				    boolean flag = false;
				    try {
				        String javaScript = "var evObj = document.createEvent('MouseEvents');"
				                            + "evObj.initMouseEvent('mouseover',true,false,window,0,0,0,0,0,false,false,false,false,0,null);"
				                            + "arguments[0].dispatchEvent(evObj);";
				        JavascriptExecutor js = (JavascriptExecutor) driver;
				        js.executeScript(javaScript, locator);
				        flag = true;
				    } catch (Exception e) {
				        flag = false;
				        System.out.println("Failed to perform MouseOver action: " + e.getMessage());
				    } finally {
				        if (flag) {
				            System.out.println("MouseOver Action is performed");
				        } else {
				            System.out.println("MouseOver Action is not performed");
				        }
				    }
				    return flag;
				}
				public static boolean JSClick(WebDriver driver, WebElement ele) {
				    boolean flag = false;
				    try {
				        JavascriptExecutor executor = (JavascriptExecutor) driver;
				        executor.executeScript("arguments[0].click();", ele);
				        flag = true;
				    } catch (Exception e) {
				        System.out.println("Failed to perform Click action: " + e.getMessage());
				    } finally {
				        if (flag) {
				            System.out.println("Click Action is performed");
				        } else {
				            System.out.println("Click Action is not performed");
				        }
				    }
				    return flag;
				}
				
				public static boolean switchToFrameByIndex(WebDriver driver, int index) {
				    boolean flag = false;
				    try {
				        new WebDriverWait(driver, 15).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
				        flag = true;
				    } catch (Exception e) {
				        System.out.println("Failed to switch to frame by Index: " + e.getMessage());
				    } finally {
				        if (flag) {
				            System.out.println("Switched to Frame with index " + index);
				        } else {
				            System.out.println("Failed to switch to Frame with index " + index);
				        }
				    }
				    return flag;
				}

				public static boolean switchToFrameById(WebDriver driver, String idValue) {
				    boolean flag = false;
				    try {
				        driver.switchTo().frame(idValue);
				        flag = true;
				    } catch (Exception e) {
				        System.out.println("Failed to switch to frame by Id: " + e.getMessage());
				    } finally {
				        if (flag) {
				            System.out.println("Switched to Frame with Id: " + idValue);
				        } else {
				            System.out.println("Failed to switch to Frame with Id: " + idValue);
				        }
				    }
				    return flag;
				}

		public static boolean switchToframeByName(String nameValue) {
			boolean flag = false;
			try {
				driver.switchTo().frame(nameValue);
				flag = true;
				return true;
			}catch (Exception e) {
			
				return false;
			}finally {
				if (flag) {
					System.out.println("Frame with Name\" + index + ");
				}else {
					System.out.println("Frame with Name\" + index + ");
				}
			}
		}
		
		public static boolean switchToDefaultFrame(WebDriver driver) {
		    boolean flag = false;
		    try {
		        driver.switchTo().defaultContent();
		        flag = true;
		    } catch (Exception e) {
		        System.out.println("Failed to switch to default content: " + e.getMessage());
		    } finally {
		        if (flag) {
		            System.out.println("Switched to Default Content");
		        } else {
		            System.out.println("Failed to switch to Default Content");
		        }
		    }
		    return flag;
		}
		public static boolean moveToElement(WebDriver driver, WebElement element) {
		    boolean flag = false;
		    try {
		        Actions actions = new Actions(driver);
		        actions.moveToElement(element).build().perform();
		        flag = true;
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        if (flag) {
		            System.out.println("Moved to the element successfully");
		        } else {
		            System.out.println("Failed to move to the element");
		        }
		    }
		    return flag;
		}
		public static boolean mouseOverElement(WebDriver driver, WebElement element) {
		    boolean flag = false;
		    try {
		        Actions actions = new Actions(driver);
		        actions.moveToElement(element).build().perform();
		        flag = true;
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        if (flag) {
		            System.out.println("MouseOver Action is performed on " + element.getText());
		        } else {
		            System.out.println("MouseOver Action is not performed");
		        }
		    }
		    return flag;
		}
		public static boolean doubleClick(WebDriver driver, WebElement element) {
	        boolean flag = false;
	        try {
	            Actions actions = new Actions(driver);
	            actions.doubleClick(element).build().perform();
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (flag) {
	                System.out.println("Double click action performed on the element");
	            } else {
	                System.out.println("Failed to perform double click action");
	            }
	        }
	        return flag;
	    }

	    // Method for performing context click (right-click) action
	    public static boolean contextClick(WebDriver driver, WebElement element) {
	        boolean flag = false;
	        try {
	            Actions actions = new Actions(driver);
	            actions.contextClick(element).build().perform();
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (flag) {
	                System.out.println("Context click (right-click) action performed on the element");
	            } else {
	                System.out.println("Failed to perform context click (right-click) action");
	            }
	        }
	        return flag;
	    }
	    public static boolean keyPress(WebDriver driver, Keys key) {
	        boolean flag = false;
	        try {
	            Actions actions = new Actions(driver);
	            actions.keyDown(key).build().perform();
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (flag) {
	                System.out.println("Key press action performed: " + key.name());
	            } else {
	                System.out.println("Failed to perform key press action");
	            }
	        }
	        return flag;
	    }

	    // Method for moving to a specific offset from an element
	    public static boolean moveToOffset(WebDriver driver, WebElement element, int xOffset, int yOffset) {
	        boolean flag = false;
	        try {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(element, xOffset, yOffset).build().perform();
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (flag) {
	                System.out.println("Moved to offset (" + xOffset + ", " + yOffset + ") from the element");
	            } else {
	                System.out.println("Failed to move to offset from the element");
	            }
	        }
	        return flag;
	    }
	}
				
				
		
					
						
			

				
			
		
			
		
		
	

