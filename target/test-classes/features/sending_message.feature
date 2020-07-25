# 1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  #  1. User should be able to click on upload files icon
  #  2-to upload files and pictures from
  #  local disks, download from external drive, select documents from bixtrix24, and create files to upload.




@sending_message @smoke
Feature: Sending message




  Scenario: user should able to click on upload files icon
    Given User login and  go to message page
    When User clicks on message text
    And User clicks on upload files icon
    Then User should see select document from Bitrix