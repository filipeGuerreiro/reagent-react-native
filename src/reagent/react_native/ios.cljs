(ns reagent.react-native.ios
  (:require [react-native :as rn]
            [reagent.core :as r]))

(def action-sheet (r/adapt-react-class rn/ActionSheetIOS))
(def data-picker (r/adapt-react-class rn/DataPickerIOS))
(def image-picker (r/adapt-react-class rn/ImagePickerIOS))
(def input-accessory-view (r/adapt-react-class rn/InputAccessoryView))
(def picker (r/adapt-react-class rn/PickerIOS))
(def progress-view (r/adapt-react-class rn/ProgressViewIOS))
(def masked-view (r/adapt-react-class rn/MaskedViewIOS))
(def segmented-control (r/adapt-react-class rn/SegmentedControlIOS))
