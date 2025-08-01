package locators

import org.openqa.selenium.By

object InventoryLocators {

  val InventoryTitle: By = By.cssSelector("span[data-test='title']")
  val expectedTitle: String = "Products"
  val DropDown:By = By.className("product_sort_container")

  val inventoryList:By = By.id("inventory_List")
  val ProductImg:By = By.className("inventory_item_img")
  val ProductLabel:By = By.className("inventory_item_name")
  val ProductDescription:By = By.className("inventory_item_description")
  val ProductPrice:By= By.className("inventory_item_price")
  val Product:By = By.className("inventory_item")

  val ShoppingCartBadge: By = By.className("shopping_cart_badge")

  val RemoveButton: By = By.xpath("//button[contains(@name, 'remove')]")
  val expectedRemoveButtonText: String = "Remove"

  val AddToCartButton: By = By.xpath("//button[contains(@name, 'add-to-cart')]")
  val expectedAddToCartButtonText: String = "Add to cart"

  val ShoppingCart: By = By.cssSelector(".shopping_cart_link")

  val MenuDropdown: By = By.id("react-burger-menu-btn")
  val LogoutLink: By = By.id("logout_sidebar_link")
  val AboutLink: By = By.id("about_sidebar_link")
  val InventoryLink: By = By.id("inventory_sidebar_link")

  val TwitterLink: By = By.cssSelector("a[data-test='social-twitter']")
  val FacebookLink: By = By.cssSelector("a[data-test='social-facebook']")
  val LinkedInLink: By = By.cssSelector("a[data-test='social-linkedin']")







}
