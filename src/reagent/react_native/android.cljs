(ns reagent.react-native.android
  (:require [react-native :as rn]
            [reagent.core :as r]))

(def date-picker (r/adapt-react-class rn/DatePickerAndroid))
(def drawer-layout (r/adapt-react-class rn/DrawerLayoutAndroid))
(def native-dialog-manager (r/adapt-react-class rn/NativeDialogManagerAndroid))
(def permissions (r/adapt-react-class rn/PermissionsAndroid))
(def progress-bar (r/adapt-react-class rn/ProgressBarAndroid))
(def toast (r/adapt-react-class rn/ToastAndroid))
(def touchable-native-feedback (r/adapt-react-class rn/TouchableNativeFeedback))
